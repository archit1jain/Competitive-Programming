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
public class RatinMaze {
    static char maze[][]={
            "0000".toCharArray(),
            "00X0".toCharArray(),
            "000X".toCharArray(),
            "0X00".toCharArray()
        };
    static int[][] soln;
    static boolean ratInMaze(int i, int j, int m, int n){
        if(i==n && j==m){
            soln[i][j]=1;
            for(int k = 0;k<=n;k++){
                for(int l = 0; l<=m; l++){
                    System.out.print(soln[k][l] +  " ");
                }
                System.out.println();
            }
            System.out.println();
            return true;
        }
        if(i>m || j>n)
            return false;
        if(maze[i][j]=='X'){ 
            return false;
        }
        soln[i][j]=1;
        boolean right = ratInMaze(i,j+1,m,n);
        boolean down = ratInMaze(i+1,j,m,n);
        soln[i][j]=0;
        return right || down;
    }
    public static void main(String[] args){
        soln = new int[10][10];
        if(!ratInMaze(0,0,3,3))
            System.out.println(-1);
    }
}
