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
public class ratinmaze2{
        static char[][] mat;
        static int[][] soln;
        public static boolean solve(int i, int j, int n , int m){
            if(i==n && j==m){
                soln[i][j]=1;
                for(int k = 0;k<=n;k++){
                    for(int l = 0;l<=m;l++)
                        System.out.print(soln[k][l]+" ");
                    
                System.out.println();
                }
                return true;
            }
            if(i>n || j>m){
                return false;
            }
            if(mat[i][j]=='X')
                return false;
            soln[i][j]=1;
            boolean right = solve(i,j+1,n,m);
            if(right) return true;
            boolean down = solve(i+1,j,n,m);
            if(down) return true;
            soln[i][j]=0;
            return right||down;
        }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		mat = new char[n][];
                soln = new int[n][m];
		for(int i = 0;i<n;i++){
			String s = sc.next().trim();
			mat[i]=s.toCharArray();
		}
                if(!solve(0,0,n-1,m-1))
                    System.out.println(-1);
		
	}
}