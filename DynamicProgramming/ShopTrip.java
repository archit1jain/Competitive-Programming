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
import java.text.DecimalFormat;
import java.util.*;
//import javafx.util.Pair;
public class ShopTrip {
    static class Pair <T,S>{
        T key;
        S value;
        Pair(T key, S value){
            this.key = key;
            this.value = value;
        }
        T getKey(){
            return key;
        }
        S getValue(){
            return value;
        }
    }
    static int N = 50;
    public static double distance(Pair<Integer,Integer> p1,Pair<Integer,Integer> p2){
        return Math.sqrt(Math.pow(p1.getKey()-p2.getKey(),2) + Math.pow(p1.getValue()-p2.getValue(),2));
    }
    static int n,k;
    static int ALL;
    static double dist[][];
    static ArrayList<Pair<Integer,Integer>> coor;
    static ArrayList<Integer> ing;
    static double dp[][];
    
    public static double shopTrip(int mask, int idx){
        if(mask==((1<<k)-1) && idx == 0) return 0;
        if(dp[mask][idx]!=-1) return dp[mask][idx];
        dp[mask][idx] = Integer.MAX_VALUE;
        for(int shop = 0; shop<=n ; shop++ ){
            if((mask|ing.get(shop)) !=mask || (shop==0)){
                System.out.println(shop);
                dp[mask][idx] = Math.min(dp[mask][idx],dist[idx][shop] + shopTrip((mask|(ing.get(shop))),shop));
            }
        }
        return dp[mask][idx];
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-->0){
           n = sc.nextInt();
           k = sc.nextInt();
           ALL = (1<<k)-1;
           coor = new ArrayList<>();
           ing = new ArrayList<>();
           coor.add(new Pair(0,0));
           for(int i =0 ;i <n;i++){
                int cx = sc.nextInt();
                int cy = sc.nextInt();
                coor.add(new Pair(cx,cy));
           }
           ing.add(0);
           int possible=0;
           for(int i =0;i<n;i++){
               String s = sc.next();
               int tempmask =0;
               for(int j = 0; j<s.length();j++){
                   tempmask|=(1<<j)*(s.charAt(s.length()-1-j)-'0');
               }
               possible|=tempmask;
               ing.add(tempmask);
           }
           //System.out.println(possible);
           if(possible!=ALL) System.out.println(-1);
           else{
               //1. distance array.
               dist = new double[n+1][n+1];
               for(int i =0;i<=n;i++){
                   for(int j = 0;j<=n;j++){
                       dist[i][j]= distance(coor.get(i),coor.get(j));
                   }
               }
               //2. dp array for top down
               dp = new double[1<<k][N];
               for(double[] a : dp) Arrays.fill(a,-1);  
               double ans = shopTrip(0,0);
               //DecimalFormat df = new DecimalFormat("#0,00");
               System.out.println(ans);
               //for(double[] a : dp)
               //System.out.println(Arrays.toString(a));
           }
       }
    }
}
