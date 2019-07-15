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
public class RobotandPath {
    static long mod = 1000000007;
    static long[][] dp;
    static int m,n;
    static long solve(){
        if(dp[0][0]==-1 || dp[m-1][n-1]==-1) return 0;
        for(int i =0;i<m;i++){
            if(dp[i][0]==-1)break;
            dp[i][0]=1;
        }
        for(int i =0;i<n;i++){
            if(dp[0][i]==-1)break;
            dp[0][i]=1;
        }
        for(int i =1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(dp[i][j]!=-1){
                if(dp[i-1][j]!=-1) dp[i][j]=dp[i-1][j]%mod;
                if(dp[i][j-1]!=-1) dp[i][j]=(dp[i][j]+dp[i][j-1])%mod;
                }
            }
        }
        //for(int i =0;i<m;i++)System.out.println(Arrays.toString(dp[i]));
        return dp[m-1][n-1];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        dp = new long[m][n];
        int p = sc.nextInt();
        for(int i =0;i<p;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            dp[x-1][y-1]=-1;
        }
        System.out.println(solve());
    }
}
