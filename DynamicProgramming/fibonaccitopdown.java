/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

/**
 *
 * @author Archit
 */
import java.util.*;
public class fibonaccitopdown {
    static int memo[];
    static int fib(int n){
        if(n==0 || n==1) return n;
        if(memo[n]!=-1){
            return memo[n];
        }
        memo[n] =fib(n-1)+fib(n-2); 
        return memo[n];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new int[1000];
        Arrays.fill(memo, -1);
        System.out.println(fib(n));
    }
}
