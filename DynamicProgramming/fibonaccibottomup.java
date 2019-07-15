/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

/**
 *
 * @author Archit
 */import java.util.*;
public class fibonaccibottomup {
    static int[] memo;
    static int fib(int n){
        memo[0]=0;
        memo[1]=1;
        for(int i =2;i<=n;i++)memo[i]=memo[i-1]+memo[i-2];
        return memo[n];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new int[n+1];
        System.out.println(fib(n));
    }
}
