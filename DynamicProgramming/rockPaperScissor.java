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
public class rockPaperScissor {
    static double[][][] dp;
    static double f1(int r, int s , int p){
        if(r==0 || s==0) return 0;
        if(p==0) return 1;
        if(dp[r][s][p]!=1.0) return dp[r][s][p];
        double tot = r*s+s*p+p*r;
        double ret = 0.0;
        ret += (f1(r-1,s,p)*((r*p)/tot));
        ret += (f1(r,s-1,p)*((r*s)/tot));
        ret += (f1(r,s,p-1)*((p*s)/tot));
        dp[r][s][p] = ret;
        return ret;
    }
    static double f2(int r, int s , int p){
        if(p==0 || s==0) return 0;
        if(r==0) return 1;
        if(dp[r][s][p]!=1.0) return dp[r][s][p];
        double tot = r*s+s*p+p*r;
        double ret = 0.0;
        ret += (f2(r-1,s,p)*((r*p)/tot));
        ret += (f2(r,s-1,p)*((r*s)/tot));
        ret += (f2(r,s,p-1)*((p*s)/tot));
        dp[r][s][p] = ret;
        return ret;
    }
    static double f3(int r, int s , int p){
        if(r==0 || p==0) return 0;
        if(s==0) return 1;
        if(dp[r][s][p]!=1.0) return dp[r][s][p];
        double tot = r*s+s*p+p*r;
        double ret = 0.0;
        ret += (f3(r-1,s,p)*((r*p)/tot));
        ret += (f3(r,s-1,p)*((r*s)/tot));
        ret += (f3(r,s,p-1)*((p*s)/tot));
        dp[r][s][p] = ret;
        return ret;
    }
    static void setdp(){
        for(double[][] a : dp)
             for(double[] c: a)
                 Arrays.fill(c,1.0);
    }
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while(t-->0){
         int r = sc.nextInt();
         int s = sc.nextInt();
         int p = sc.nextInt();
         dp  = new double[r+1][s+1][p+1];
         setdp();
         System.out.print(f1(r,s,p)+" ");
        setdp();
        System.out.print(f2(r,s,p)+ " ");
        setdp();
        System.out.print(f3(r,s,p)+ " ");
        System.out.println();
     }
    }
}
