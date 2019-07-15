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
public class robotcolleatCoints {
    static int[][] mat;
    static int n;
    static boolean power;
    public static int f(int i, int j){
       // System.out.println(i+ " "+j+" "+k);
        if(i==n || j<0 || j==5){
            return 0;
        }
        int ans;
        if(i<5 && !power && mat[i][j]==-1){
           power = true;
           ans =  Math.max(f(i+1,j),Math.max(f(i+1,j-1),f(i+1,j+1)));
           power = false;
        }
        else{
           ans = mat[i][j] + Math.max(f(i+1,j),Math.max(f(i+1,j-1),f(i+1,j+1)));
        }
        // power = false;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            mat = new int[n][5];
            for(int i = 0 ;i<n;i++){
                for(int j = 0;j<5;j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            power = false;
            System.out.println(Math.max(f(0,2),Math.max(f(0,1),f(0,3))));
        }
        
    }
}
