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
public class ValentinesMagic {
    static int n, m;
    static int[] a,b;
    static int[][] dp;
    
    
    //i is index for boy and j is index of girl
    static int solve(int i, int j){
        if(i==n) return 0;
        if(j==m) return 100000000;
        if(dp[i][j]!=-1) return dp[i][j];
        int opt1 = Math.abs(a[i]-b[j]) + solve(i+1,j+1);
        int opt2 = solve(i,j+1);
        dp[i][j] = Math.min(opt1, opt2);
        return dp[i][j];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        dp = new int[n+1][m+1];
        a = new int[n];
        for(int i =0;i<n;i++) a[i]=sc.nextInt();
        b = new int[m];
        for(int i =0;i<m;i++) b[i]=sc.nextInt();
        for(int[] c: dp)Arrays.fill(c,-1);
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(solve(0,0));
    }
}
