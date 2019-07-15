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
import static RecursionBacktracking.permutation.s;
import java.util.*;
public class generateParan {
        public static void solve(int n,int o,int c, String s){
        if(n==c){
            System.out.println(s);
            return;
        }
        if(o>c){
            solve(n,o,c+1,s+")");
        }
        if(o<n){
            solve(n,o+1,c,s+"(");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n,0,0,"");
        
    }
}
