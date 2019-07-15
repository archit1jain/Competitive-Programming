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
public class subsetSum {
    static int n,k;
    static int[] a;
    public static boolean solve(int target,int i){
        if(i==n) return target==0;
        return solve(target-a[i],i+1) || solve(target,i+1);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[n];
        for(int i = 0;i<n;i++)a[i]=sc.nextInt();
        boolean dp[][] = new boolean[k+1][n+1];
        for(int i = 0;i<n;i++)dp[0][i]=true;
        for(int i = 1;i<=k;i++)dp[i][0]=false;
        for(int i= 1;i<=k;i++){
            for(int j=1;j<=n;j++){
                dp[i][j]=dp[i][j-1];
                if(i>=a[j-1]){
                    dp[i][j]=dp[i][j] || dp[i-a[j-1]][j-1];
                }
            }
        }
        if(dp[k][n])
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
