/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionBacktracking;

/**
 *
 * @author Archit
 */
import java.util.*;
public class codesOfString {
    static boolean check(int n){
        return !(n>26 || n==0);
    }
    static List<String> l;
    static char[] str;
    static char extract(int i, int j){
        int ans = 0;
        for(int k = 0;k<j;k++){
            ans*=10;
            ans = ans+ (str[i+k]-'0');
        }
        return (char)(ans+96);
    }
    static void solve(int i, String s){
        //Base Case
        if(i==str.length){
            l.add(s);
            return;
        }
        //Recursive Case
        if(i+1<=str.length && check(str[i]-'0')){
            solve(i+1,s+extract(i,1));
        }
        if(i+2<=str.length && check(10*(str[i]-'0')+(str[i+1]-'0'))){
            solve(i+2,s+extract(i,2));
        }
        
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        str = sc.next().toCharArray();
        l = new ArrayList<>();
        solve(0,"");
        System.out.println(l);
    }
}
