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
public class Allones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int max = 0;
        for(int i = 0;i<n;i++)
            for(int j = 0;j<m;j++){
                a[i][j]=sc.nextInt();
                max = Math.max(a[i][j], max);
            }
        
        for(int i=1;i<n;i++)
            for(int j =1;j<m;j++){
                if(a[i][j]==1){
                    a[i][j] = 1 + Math.min(a[i-1][j], Math.min(a[i-1][j-1],a[i][j-1]));
                    max = Math.max(a[i][j], max);
                }
            }
        System.out.println(max);
    }
}
