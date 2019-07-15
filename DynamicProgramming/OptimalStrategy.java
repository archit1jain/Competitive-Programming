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
public class OptimalStrategy {
    static int[] a;
    static int n;
    static int[][] dp;
    static int solve(int i, int j){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int q1 = solve(i+2,j);
        int q2 = solve(i+1,j-1);
        int q3 = solve(i,j-2);
        dp[i][j] = Math.max(a[i]+Math.min(q1, q2),a[j]+Math.min(q2,q3));
        return dp[i][j];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        dp = new int[n+1][n+1];
        for(int[] d : dp)Arrays.fill(d, -1);
        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(solve(0,n-1));
    }
}
