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
public class gridProblem {
    static int[][] a;
    static int n;
    //recurance
    static int solve(int i, int j){
        if(i==n-1 && j==n-1){
            return a[i][j];
        }
        int ans = 0;
        if(i==n-1){
            ans=a[i][j]+solve(i+1,j);
        }
        else if(j==n-1){
            ans=a[i][j]+solve(i,j+1);
        }
        else{
            ans=a[i][j]+Math.min(solve(i+1,j),solve(i,j+1));
        }
        return ans;
    }
    static int[][] dp;
    static int solve2(int i, int j){
        dp = new int[n][n];
        dp[0][0]=a[0][0];
        for(int k = 1;k<n;k++){
            dp[k][0]=dp[k-1][0]+a[k][0];
            dp[0][k]=dp[0][k-1]+a[0][k];
        }
        for(int k = 0 ;k<n;k++)System.out.println(Arrays.toString(dp[k]));
        for(int k = 1;k<n;k++){
            for(int l=k;l<n;l++){
                dp[k][l]=a[k][l]+Math.min(dp[k-1][l],dp[k][l-1]);
                dp[l][k] = a[l][k]+Math.min(dp[l-1][k], dp[l][k-1]);
            }
        }
        for(int k = 0 ;k<n;k++)System.out.println(Arrays.toString(dp[k]));
        return dp[n-1][n-1];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n][n];
        for(int i =0;i<n;i++)
            for(int j = 0; j<n;j++)
                a[i][j]=sc.nextInt();
        System.out.println(solve2(0,0));
    }
}
