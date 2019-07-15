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
public class deepakandhisjourney {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            //int min = Integer.MAX_VALUE;
            long[] a = new long[n];
            long[] b = new long[n];
            for(int i = 0;i<n;i++)a[i]=sc.nextLong();
            for(int i = 0;i<n;i++)b[i]=sc.nextLong();
            long sum = 0;
            long min = Long.MAX_VALUE;
            for(int i = 0;i<n;i++){
                min = Math.min(min, a[i]);
                sum+=(min*b[i]);
            }
            System.out.println(sum);
        }
    }
}
