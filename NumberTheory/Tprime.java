/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberTheory;

/**
 *
 * @author Archit
 */
import java.util.*;
import java.math.*;
public class Tprime {
    public static String check(long n){
        for(int i =2;i*i<=n;i++){
            if(n%i==0) return "NO";
        }
        return "YES";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tt =0;tt<t;tt++){
            long d = sc.nextLong();
            long n = (long) Math.sqrt(d);
            if(n*n!=d || n==0 || n==1){System.out.println("NO");continue;}
            System.out.println(check(n));
            
        }
    }
}
