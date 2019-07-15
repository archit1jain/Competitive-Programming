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
public class LCSprint {
    static String s1,s2;
    static int n,m;
    static int dp[][];
    public static void cal(){
        for(int i =0;i<n;i++){
            dp[i][0]=0;
        }
        for(int i =0;i<m;i++){
            dp[0][i]=0;
        }
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        for(int[] a :dp)
        System.out.println(Arrays.toString(a));
    }
    public static void print(){
        cal();
        char[] ans = new char[dp[n][m]];
        int i = n,j=m,k=dp[n][m]-1;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                ans[k]=s1.charAt(i-1);k--;i--;j--;
            }
            else{
                if(dp[i-1][j]>dp[i][j-1]){
                    i--;
                }
                else
                    j--;
            }
        }
        for(char c : ans)
            System.out.print(c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        n = s1.length();
        m = s2.length();
        dp = new int[n+1][m+1];
        //System.out.println(print());
        print();
    }
}
