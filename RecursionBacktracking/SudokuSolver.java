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
public class SudokuSolver {
    static int mat[][] = 
    {
        {5,3,0,0,7,0,0,0,0},
        {6,0,0,1,9,5,0,0,0},
        {0,9,8,0,0,0,0,6,0},
        {8,0,0,0,6,0,0,0,3},
        {4,0,0,8,0,3,0,0,1},
        {7,0,0,0,2,0,0,0,6},
        {0,6,0,0,0,0,2,8,0},
        {0,0,0,4,1,9,0,0,5},
        {0,0,0,0,8,0,0,7,9}
    };
    static boolean solve(int i,int j,int n){
        if(i==n) {
            for(int k =0;k<n;k++)
                System.out.println(Arrays.toString(mat[k]));
            return true;
        }
        if(j==n){
            return solve(i+1,0,n);
        }
        if(mat[i][j]!=0){
            return solve(i,j+1,n);
        }
        for(int number = 1;number<=n;number++){
            if(canPlace(i,j,n,number)){
                mat[i][j]=number;
                boolean couldbesolved = solve(i,j+1,n);
                if(couldbesolved)
                    return true;
            }
        }
        mat[i][j]=0;
        return false;
    }
    public static void main(String[] args){
        System.out.println(solve(0,0,9));
    }

    static boolean canPlace(int i, int j, int n, int number) {
        int mn = (int) Math.sqrt(n);
        int sx = (i/mn)*mn;
        int sy = (j/mn)*mn;
        for(int k = 0;k<mn;k++){
            for(int l = 0;l<mn;l++)
            if(mat[sx+k][sy+l]==number)
                return false;
        }
        for(int l = 0;l<n;l++){
            if(mat[i][l]==number) return false;
            if(mat[l][j]==number) return false;
        }
        return true;
    }
}
