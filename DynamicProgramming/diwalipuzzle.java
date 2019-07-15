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
public class diwalipuzzle {
    static long[][][] dp;
    static int n, k;
    static long mod = 1000003;
    static long f(int i, int prev, int count){
        if(i==n){
            if(count==k)return 1;
            else return 0;
        }
        if(dp[i][prev][count]!=-1) return dp[i][prev][count];
        long ans = 0;
        if(prev == 1){
            ans = (ans + f(i+1,1,count+1));
        }
        else{
            ans = (ans+f(i+1,1,count));
        }
        ans = ans%mod;
        ans = (ans+f(i+1,0,count));
        ans = ans%mod;
        dp[i][prev][count]=ans;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            k = sc.nextInt();
            dp = new long[105][3][105];
            for(long[][] a : dp)
                for(long[] b : a){
                    Arrays.fill(b, -1);
                }
            System.out.println((f(1,0,0)+f(1,1,0))%mod);
        }
    }
}
