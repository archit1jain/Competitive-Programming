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
public class ExchangeCoin {
    static long dp[];
    public static long solve(int m){
        dp[0]=0;
        dp[1]=1;
        for(int i = 2;i<=m/2;i++){
            dp[i]=Math.max(i,dp[i/2]+dp[i/3]+dp[i/4]);
        }
        return Math.max(m,dp[m/2]+dp[m/4]+dp[m/3]);
        /*
        if(m==0 || m==1){
            return m;
        }
        if(dp[m]!=0) return dp[m];
        dp[m] = Math.max(m,solve(m/2)+solve(m/3)+solve(m/4));
        return dp[m];
        */
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new long[n/2+1];
        //Arrays.fill(dp,-1);
        System.out.println(solve(n));
    }
}
