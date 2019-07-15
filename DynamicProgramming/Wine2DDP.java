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
public class Wine2DDP {
    //recursion
    static int solve(int[] a, int i, int j,int year){
        if(i>=j) return year*a[i];
        int q1 = a[i]*year + solve(a,i+1,j,year+1);
        int q2 = a[j]*year + solve(a,i,j-1,year+1);
        return Math.max(q1,q2);
    }
    //bottomup
    /*
    static int memo[][];
    static int solve1(int[] a, int i, int j,int year){
        memo = new int[year+1][2];
        for(int k = 1; k<=year ; k++){
            memo[k][0] = Math.max(memo[k-1][0]+year*a[i],memo[k-1][1]+k*a[i]);
            i++;
            memo[k][1] = Math.max(memo[k-1][1]+year*a[j],memo[k-1][0]+k*a[j]);
            j--;
        }
        return memo[year][0];
    }
    */
    //topdown
    static int[][] memo2;
    static int solve2(int[] a, int i, int j,int year){
        if(i>=j) return year*a[i];
        if(memo2[i][j]!=0) return memo2[i][j];
        int q1 = a[i]*year + solve(a,i+1,j,year+1);
        int q2 = a[j]*year + solve(a,i,j-1,year+1);
        memo2[i][j]= Math.max(q1,q2);
        return memo2[i][j];
    }
    static int solve3(int[] a, int n){
        int[][] dp = new int[n][n];
        int year = n;
        for(int i = 0;i<n;i++)
            dp[i][i]=year*a[i];
        --year;
        for(int len = 2;len<=n;len++){
            int str = 0;
            int end = n-len;
            while(str<=end){
                int endwindow = str+len-1;
                dp[str][endwindow]=Math.max(a[str]*year + dp[str+1][endwindow],a[endwindow]*year + dp[str][endwindow-1]);
                str++;
            }
            --year;
        }
       // for(int i =0;i<n;i++){
        //    System.out.println(Arrays.toString(dp[i]));
        //}
        return dp[0][n-1];
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++)
            a[i]=sc.nextInt();
        memo2=new int[n][n];
        //Arrays.fill(memo2,-1);
        System.out.println(solve(a,0,n-1,1));
        System.out.println(solve2(a,0,n-1,1));
        System.out.println(solve3(a,n));
    }
}
