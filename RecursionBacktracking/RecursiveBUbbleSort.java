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
public class RecursiveBUbbleSort {
    public static int[] bubbleSort(int[] a, int n){
        if(n==1) return a;
        for(int i = 0;i<n-1;i++){
            if(a[i]>a[i+1]){
                a[i]=a[i]^a[i+1];a[i+1]=a[i]^a[i+1];a[i]=a[i]^a[i+1];
            }
        }
        return bubbleSort(a,n-1);
    }
    public static int[] bubbleSort1(int[] a, int n, int i){
        if(n==1) return a;
        if(i==n-1) return bubbleSort1(a,n-1,0);
        if(a[i]>a[i+1]){
                a[i]=a[i]^a[i+1];a[i+1]=a[i]^a[i+1];a[i]=a[i]^a[i+1];
            }
        return bubbleSort1(a,n,i+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = {1,4,2,5,2,6,9,2};
        System.out.println(Arrays.toString(bubbleSort1(a,a.length,0)));
    }
}
