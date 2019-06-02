/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberTheory;

/**
 *
 * @author Archit
 */

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int tt =0;tt<test;tt++){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i =0;i<n;i++)a[i]=sc.nextInt();
            Stack<String> s1 = new Stack<>();
            int s1c=0,s2c=0;
            Stack<String> s2 = new Stack<>();
            int[] dp = new int[n];
            dp[0]=Math.max(0,a[0]);
            if(dp[0]!=0){s1.push(String.valueOf(dp[0]));s1c+=dp[0];}
            dp[1]=Math.max(a[0],a[1]);
            if(dp[1]!=0){s2.push(String.valueOf(dp[1]));s2c+=dp[1];}
            for(int i = 2;i<n;i++){
                if(Math.max(0,a[i])+dp[i-2]>=dp[i-1]){
                    if(a[i]!=0){
                        if(i%2==0){s1.push(String.valueOf(a[i]));s1c+=a[i];}
                        else {s2.push(String.valueOf(a[i]));s2c+=a[i];}
                    }
                }    
                dp[i]=Math.max(Math.max(0,a[i])+dp[i-2],dp[i-1]);

                //dp[i]=Math.max(Math.max(0,a[i])+dp[i-2],dp[i-1]);
            }
            System.out.println(s1);
            System.out.println(s2);
            if(s1c!=s2c){
                if(s1c==dp[n-1]){
                    while(!s1.empty())System.out.print(s1.pop());
                }
                else{
                    while(!s2.empty())System.out.print(s2.pop());
                }
            }
            else{
                if(s1.size()>s2.size()){
                    while(!s1.empty())System.out.print(s1.pop());
                }
                else{
                    while(!s2.empty())System.out.print(s2.pop());
                }
            }
        }

   }
}
