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
public class wildCardMatching {
    static String s,p;
    static int slen,plen;
    public static boolean f(){
        if(plen==0) return (slen==0);
        boolean dp[][] = new boolean[plen+1][slen+1];
       for(boolean[] a : dp)Arrays.fill(a, false);
        dp[0][0] = true;
        for(int i = 1;i<=plen;i++){
            if (p.charAt(i - 1) == '*') 
                dp[i][0] = dp[i-1][0];
        }
        for(int i = 1;i<=plen;i++){
            for(int j = 1;j<=slen;j++){
                if(p.charAt(i-1)=='*')
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j]; 
                else if(p.charAt(i-1)=='?' || p.charAt(i-1)==s.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else dp[i][j]=false;
            }
        }
        return dp[plen][slen];
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        p = sc.next();
        slen = s.length();
        plen = p.length();
        if(f())System.out.println("MATCHED");
        else System.out.println("UNMATCHED");
    }
}
