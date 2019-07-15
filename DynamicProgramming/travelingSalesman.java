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
public class travelingSalesman {
    static int n = 4;
    //adjacency matrix
    static int dist[][] = {{0,20,42,25},
                          {20,0,30,42},
                          {42,30,0,10},
                          {25,34,10,0}};
    //if all cities have been visited
    static int VISITED_ALL = (1<<n)-1;
    static int dp[][];
    public static int tsp(int mask, int pos){
        if(mask==VISITED_ALL) return dist[pos][0];
        int ans = Integer.MAX_VALUE;
        // try to go to unvidited cities
        if(dp[mask][pos]!=-1) return dp[mask][pos];
        for(int city = 0;city <n;city++){
            if((mask&(1<<city))==0){
                int newans = dist[pos][city] + tsp( mask|(1<<city),city);
                ans = Math.min(ans,newans);
            }
        }
        dp[mask][pos]=ans;
        return ans;
    }
    public static void main(String[] args){
        dp = new int[1<<n][n];
        for(int[] a : dp) Arrays.fill(a, -1);
        System.out.println(tsp(1,0));
    }
}
