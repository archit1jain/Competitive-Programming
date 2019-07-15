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
    public class MoneyChange {
        static int n,s;
        static int[] a;
        static long[][] dp;
        static long mod = 1000000007;
        static long solve(int i, int s){
            if(s==0) return 1;
            if(s<0) return 0;
            if(i==n) return 0;
            if(dp[i][s]!=-1) return dp[i][s];
            long ans = 0;
            ans=(ans+solve(i+1,s))%mod;
            ans=(ans+solve(i,s-a[i]))%mod;
            dp[i][s]=ans%mod;
            return ans;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                n = sc.nextInt();
                a = new int[n];
                for(int i =0;i<n;i++) a[i]=sc.nextInt();
                s = sc.nextInt();
                dp = new long[n+1][s+1];
                for(long[] b : dp) Arrays.fill(b,-1);
                System.out.println(solve(0,s));
            }
        }
    }
