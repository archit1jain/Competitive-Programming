/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwiseOperation;

/**
 *
 * @author Archit
 */
import java.util.*;
public class sumOfBitDefferences {
    public static int cal(int n){
        int count = 0;
        while(n!=0){
            int p = n & (-n);
            count++;
            n-=p;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j =0;j<n;j++)
                a[j]=sc.nextInt();
            int sum =0;
            System.out.println(Arrays.toString(a));
            for(int j =0;j<n;j++){
                for(int k = 0;k<n;k++){
                    sum+=cal(a[j]^a[k]);
                    System.out.println(a[j]^a[k]);
                }
            }
            System.out.println(sum);
        }
    }
}
