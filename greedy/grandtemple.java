/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy;

/**
 *
 * @author Archit
 */
import java.util.*;
public class grandtemple {
    public static void main(String[] args){
        Scanner sc   = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
       int dx=0,dy=0;
       for(int i =0;i<n-1;i++){
           dx = Math.max(dx,Math.abs(x[i+1]-x[i])-1);
           dy = Math.max(dy, Math.abs(y[i+1]-y[i])-1);
       }
       System.out.println(dx*dy);
    }
}
