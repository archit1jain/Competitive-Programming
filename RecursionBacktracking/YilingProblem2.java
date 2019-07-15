/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionBacktracking;

/**
 *
 * @author Archit
 */
import java.util.*;

public class YilingProblem2 {
    static int ans;
    static int[] dp;
    static int mod = 1000000007;
    /*static int solve(int m ,int n){
        if(n<0) return 0;
        if(dp[n]!=0) return dp[n];
        dp[n]=(solve(m,n-1)+solve(m,n-m))%mod;
        return dp[n]%mod;
    }
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            dp = new int[n+1];
            dp[0]=1;
            for(int j = 1;j<=n;j++){
                dp[j]=dp[j-1];
                if(j-m>=0){
                    dp[j]= (dp[j]+dp[j-m])%mod; 
                }
                dp[j]%=mod;
            }
            System.out.println(dp[n]);
        }
    }
}
