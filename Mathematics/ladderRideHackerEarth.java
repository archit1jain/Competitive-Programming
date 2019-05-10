/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics;

/**
 *
 * @author Archit
 */
import java.util.*;
import java.math.*;
public class ladderRideHackerEarth {
    static BigInteger[] memo;
    public static BigInteger solve(int n){
        if(n<=0) return BigInteger.ZERO;
        if(memo[n]!=null) return memo[n];
        
        
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        for(int tt =0;tt<t;tt++){
            int curr = sc.nextInt();
            int k = sc.nextInt();
            if(curr==n) System.out.println(0);
            else{
                int l = n-curr;
                memo = new BigInteger[l+1];
                //memo[]
            }
        }
    }
}
