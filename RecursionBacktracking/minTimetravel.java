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
import javafx.util.Pair;
public class minTimetravel {
    static boolean visited[][];
    static int grid[][];
    static int[][] wh;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        visited = new boolean[2000][2000];
        Arrays.fill(visited,false);
        grid = new int[2000][2000];
        int n = sc.nextInt();
        int sx = sc.nextInt(),sy=sc.nextInt(),dx=sc.nextInt(),dy=sc.nextInt();
        wh = new int[n][3];
        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            grid[x][y]=i+1;
            wh[i][0]=sc.nextInt();
            wh[i][1]=sc.nextInt();
            wh[i][2]=sc.nextInt();
        }
        System.out.println(solve(sx,sy,dx,dy));
        }
    }

    private static int solve(int i, int j, int dx, int dy) {
        if(i==dx && j==dy) return 0;
        if( )
        if(grid[i][j]>0){
            int k = grid[i][j];
            return (wh[k][2]+solve(wh[k-1][0],wh[k-1][1],dx,dy));
        }
        int right,left,up,down;
            
    }
}

