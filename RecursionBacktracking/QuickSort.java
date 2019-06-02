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
public class QuickSort {
    static int[] a;
    public static void quickSort(int l,int r){
        if(l>=r) return;
        int p = partition(l,r);
        quickSort(l,p-1);
        quickSort(p+1,r);
        
    }
    static void swap(int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
        return;
    }
    public static int partition(int s, int e){
        int pivot = a[e];
        int i = s-1;
        for(int j = s;j<e;j++){
            if(a[j]<=pivot){
                i++;
                swap(i,j);
            }
        }
        Swap(a[i],a[e]);
        swap(e,i+1);
        System.out.println(Arrays.toString(a));
        return i+1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n];
        for(int i =0;i<n;i++)a[i]=sc.nextInt();
        quickSort(0,n-1);
        System.out.println(Arrays.toString(a));
    }
}
