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
public class Knapsack01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] w = new int[n];
        for(int i =0;i<n;i++)a[i]=sc.nextInt();
        for(int i =0;i<n;i++)w[i]=sc.nextInt();
        int[][] dp = new int[k+1][n+1];
        for(int i =0;i<=n;i++)dp[0][i]=0;
        for(int i = 0;i<=k;i++)dp[i][0]=0;
        for(int i = 1;i<=k;i++){
            for(int j = 1;j<=n;j++){
                dp[i][j]=dp[i][j-1];
                if(a[j-1]<=i){
                    dp[i][j] = Math.max(dp[i][j], w[j-1]+dp[i-a[j-1]][j-1]);
                }
            }
        }
        System.out.println(dp[k][n]);
    }
}
