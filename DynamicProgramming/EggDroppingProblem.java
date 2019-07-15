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
public class EggDroppingProblem {
    static int solve(int n, int k){
        if(k==1) return n;
        if(dp[n][k]!=-1) return dp[n][k];
        int ans = Integer.MAX_VALUE;
        for(int x = 1;x<=n;x++){
            ans = Math.min(ans,Math.max(1+solve(x-1,k-1),1+solve(n-x,k)));
        }
        dp[n][k]=ans;
        return dp[n][k];
    }
    static int[][] dp;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        dp = new int[n+1][k+1];
        for(int[] a : dp)Arrays.fill(a, -1);
        System.out.println(solve(n,k));
    }
}
