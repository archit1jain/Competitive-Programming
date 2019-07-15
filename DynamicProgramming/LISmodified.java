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
public class LISmodified {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            long[] w = new long[n];
            for(int i =0;i<n;i++)a[i]=sc.nextInt();
            for(int i =0;i<n;i++)w[i]=sc.nextInt();
            long[] dp = w;
            long result = 0;
            for(int i =0;i<n;i++){
                long max = 0;
                for(int j = 0;j<=i;j++){
                    if(a[j]<a[i]){
                        max = Math.max(max, dp[j]);
                    }
                }
                dp[i]=w[i]+max;
                result=Math.max(result,dp[i]);
            }
            System.out.println(result);
        }
    }
}
