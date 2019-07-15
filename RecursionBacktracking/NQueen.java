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
public class NQueen {
    static int board[][];
    static boolean isSafe(int i, int j,int n){
        for(int row=0;row<i;row++){
            if(board[row][j]==1) return false;
        }
        for(int row = i,col=j;row>=0 && col>=0;row--,col--){
            if(board[row][col]==1) return false;
        }
        
        for(int row = i,col=j;row>=0 && col<n;row--,col++){
            if(board[row][col]==1) return false;
        }
        return true;
        
    }
    public static boolean solve(int i, int n){
        //base case
        if(i==n){
            //successful
            //print board
            for(int j = 0;j<n;j++){
                System.out.println(Arrays.toString(board[j]));
            }
            System.out.println("-----------------");
            return false;
        }
        //recursion
        for(int j = 0;j<n;j++){
            if(isSafe(i,j,n)){
            board[i][j]=1;
            boolean nextQueen = solve(i+1,n);
            if(nextQueen) return true;
            board[i][j]=0;
            }
        }
        return false;
    } 
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         board = new int[n][n];
         boolean b = solve(0,n);  
    }
}
