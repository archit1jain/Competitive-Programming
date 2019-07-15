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
public class minjumpArray {
    static ArrayList<Integer> l;
    public static int[] dp;
    static int solve(){
        dp = new int[l.size()+1];
        Arrays.fill(dp, Integer.MAX_VALUE-10);
        dp[0]=0;
        for(int i =1;i<=l.size();i++){
            for(int j = 0;j+i<dp.length && j<=l.get(i-1);j++){
                dp[i+j]=Math.min(dp[i+j],1+dp[i-1]);
            }
        }
        if(dp[l.size()]==Integer.MAX_VALUE-10) return -1;
        return dp[l.size()];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        l = new ArrayList<>();
        for(int i =0;i<n;i++)l.add(sc.nextInt());
        System.out.println(solve());
    }
}
