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
public class LongestIncreasingSubsequence {
    static int solve(int[] a,int n){
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i =0;i<n;i++){
            int max = 0;
            for(int j = 0;j<i;j++){
                if(a[j]<=a[i])  max = Math.max(max,dp[j]);
            }
            dp[i]=dp[i]+max;
        }
        int max = 0;
        for(int i =0;i<n;i++)max = Math.max(max,dp[i]);
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(solve(a,n));
    }
}
