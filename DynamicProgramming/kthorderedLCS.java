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
public class kthorderedLCS {
    static int[][][] dp;
    static String s1,s2;
    static int kthlcs(int i, int j,int k){
        if(i==s1.length() || j==s2.length()) return 0;
        if(dp[i][j][k]!=-1) return dp[i][j][k];
        int res=0;
        if(s1.charAt(i)==s2.charAt(j)){
            res= 1+kthlcs(i+1,j+1,k);
        }
        else{
            if(k>0) 
                res = 1+kthlcs(i+1,j+1,k-1);
            res = Math.max(res,Math.max(kthlcs(i,j+1,k),kthlcs(i+1,j,k)));
        }
        dp[i][j][k]=res;
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        s1 = sc.next();
        s2 = sc.next();
        int k = sc.nextInt();
        dp = new int[s1.length()+1][s2.length()+1][k+1];
        for(int[][] a: dp){
            for(int[] b: a){
                Arrays.fill(b, -1);
            }
        }
        System.out.println(kthlcs(0,0,k));
        
    }
}
