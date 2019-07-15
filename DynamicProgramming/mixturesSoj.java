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
public class mixturesSoj {
    static int[] a;
    static int[][] dp;
    static int sum(int i, int j){
        int sum = 0;
        for(int k = i;k<=j;k++)
            sum=(sum+a[k])%100;
        return sum;
    }
    static int solve(int i, int j){
        if(i>=j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        dp[i][j]= Integer.MAX_VALUE;
        for(int k = i;k<=j;k++){
            dp[i][j]=Math.min(dp[i][j], solve(i,k)+solve(k+1,j) + sum(i,k)*sum(k+1,j));
        }
        return dp[i][j];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();       
            a = new int[n];
            dp = new int[n+1][n+1];
            for(int[] b:dp)Arrays.fill(b, -1);
            for(int i =0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println(solve(0,n-1));
        }
    }
}
