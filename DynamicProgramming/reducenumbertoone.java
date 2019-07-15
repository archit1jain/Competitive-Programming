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
public class reducenumbertoone {
    static int inf = 1000000000;
    static int[] memo;
    //can cause stack overflow
    //top down approach
    //memoization
    static int red(int n){
        if(n==1) return 0;
        if(memo[n]!=0) return memo[n]; // can save us from recomputation.
        int q1 = inf,q2=inf,q3=inf;
        if(n%3==0)q1 = 1+red(n/3);
        if(n%2==0)q2 = 1+red(n/2);
        q3 =1+red(n-1);
        memo[n] = Math.min(Math.min(q1,q2),q3);
        return memo[n];
    }
    //bottom up approach
    //pure DP 
    static int red1(int n){
        for(int i = 2;i<=n;i++){
            int q1 = inf,q2=inf,q3=inf;
            if(i%3==0)q1 = 1+memo[i/3];
            if(i%2==0)q2 = 1+memo[i/2];
             q3 =1+memo[i-1];
             memo[i] = Math.min(Math.min(q1,q2),q3);
        }
        return memo[n];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new int[n+1];
        System.out.println(red1(n));
    }
}
