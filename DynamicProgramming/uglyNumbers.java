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
public class uglyNumbers {
    static long dp[];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        dp = new long[10001];
        dp[0]=dp[1]=1;
        int i,j,k;
        i=j=k=1;
        for(int l = 2;l<dp.length;l++){
            if(dp[i]*2<dp[j]*3){
                if(dp[i]*2<dp[k]*5){
                    dp[l]=dp[i]*2;
                    i++;
                }
                else{
                    dp[l]=dp[k]*5;
                    k++;
                }
            }
            else{
                if(dp[j]*3<dp[k]*5){
                    dp[l]=dp[j]*3;
                    j++;
                }
                else{
                    dp[l]=dp[k]*5;
                    k++;
                }
            }
            if(dp[l]==dp[l-1])l--;
        }      
        //System.out.println(Arrays.toString(dp));
        while(t-->0){
            int n = sc.nextInt();
           System.out.println(dp[n]);
       }
    }
}
