/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionBacktracking;

/**
 *
 * @author Archit
 */
import java.util.*;
public class friendsPairing {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        long[] dp = new long[31];
        dp[0]=dp[1]=1;
        for(int i = 2;i<31;i++){
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            System.out.println(dp[sc.nextInt()]);
        }
        
    }
}
