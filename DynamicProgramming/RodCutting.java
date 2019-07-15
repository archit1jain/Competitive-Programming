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
public class RodCutting {
    //recursion
    static int solve(int[] a, int length){
        if(length==0) return 0;
        int max = 0;
        for(int i =0;i<length;i++){
            max = Math.max(max,a[i]+solve(a,length-i-1));
        }
        return max;
    }
    
    //bottomup
    static int[] dp;
    static int solve1(int[] a, int length){
        if(length==0) return 0;
        if(dp[length]!=0) return dp[length];
        int max = 0;
        for(int i =0;i<length;i++){
            max = Math.max(max,a[i]+solve(a,length-i-1));
        }
        dp[length]=max;
        return dp[length];
    }
    
    //topdown
    static int solve2(int[] a, int length){
        dp = new int[length+1];
        dp[0]=0;
        for(int i = 1;i<=length;i++){
            int best = 0;
            for(int cut = 0;cut<i;cut++){
                best=Math.max(best,a[cut]+dp[i-cut-1]);
            }
            dp[i]=best;
        }
        return dp[length];
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++)a[i]=sc.nextInt();
        dp=new int[n+1];
        System.out.println(solve2(a,n));
    }
}
