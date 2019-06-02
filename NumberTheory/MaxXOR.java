/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberTheory;

/**
 *
 * @author Archit
 */
import java.util.*;
import java.math.*;
public class MaxXOR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long xor=0;
        for(int i =0;i<n;i++){
            a[i]=sc.nextLong();
            xor^=a[i];
        }
        long max  = 0;
        for(int i =0;i<n;i++)max = Math.max(xor^a[i],max);
        System.out.println(max);
    }
}
