/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

import java.util.*;

/**
 *
 * @author Archit
 */
public class EditDistance {
    static int editdist(String in, String out){
        int[][] dp = new int[in.length()+1][out.length()+1];
        for(int i =0;i<=in.length();i++){
            dp[i][0]=i;
        }
        for(int i =0;i<=out.length();i++){
            dp[0][i]=i;
        }
        for(int i = 1;i<=in.length();i++){
            for(int j = 1;j<=out.length();j++){
                int min = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j], dp[i][j-1])); //replace,delete,insert
                if(in.charAt(i-1)!=out.charAt(j-1)) {min++;dp[i][j]=min;
                }
                else{
                    dp[i][j]=dp[i-1][j-1];
                }
            }
        }
        for(int i =0;i<=in.length();i++)
            System.out.println(Arrays.toString(dp[i]));
        return dp[in.length()][out.length()];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        String out = sc.next();
        System.out.println(editdist(in,out));
    }
}
