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
public class permutation {
    static char[] s;
    static Set<String> s1;
    public static void swap(int i, int j){
        char temp = s[i]; 
            s[i] = s[j]; 
            s[j] = temp; 
    }
    public static void permute(int i){
        if(i==s.length){
            s1.add((new String(s)));
            return;
        }
        for(int j = i;j<s.length;j++){
            swap(i,j);
            permute(i+1);
            swap(i,j); 
        }
         
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        s = sc.next().toCharArray();
        s1 = new TreeSet<>();
        permute(0);
        Iterator<String> i = s1.iterator();
        while(i.hasNext()){
            System.out.println((String)i.next());
        }
    }
}
