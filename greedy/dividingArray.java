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
public class dividingArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0;i<n;i++){
                a[i]=sc.nextLong();
            }
            Arrays.sort(a);
            //System.out.println(Arrays.toString(a));
            long sum = 0;
            for(int i = 0;i<n;i+=2){
                sum+=Math.abs(a[i]-a[i+1]);
            }
            System.out.print(sum+" ");
            sum = 0;
            for(int i =0;i<(n/2);i++){
                sum+=Math.abs(a[i]-a[n-1-i]);
            }
            System.out.println(sum);
        }
    }
}
