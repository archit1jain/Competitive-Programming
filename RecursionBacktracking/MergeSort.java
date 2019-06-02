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
public class MergeSort {
    static int[] a;
    public static void mergeSort(int l,int r){
        if(l==r) return;
        int m = (l+r)/2;
        mergeSort(l,m);
        mergeSort(m+1,r);
        merge(l,r);
    }
    public static void merge(int b, int c){
        int[] temp = new int[c-b+1];
        int m = (b+c)/2;
        int i = b,j=m+1,k=0;
        while(i<=m && j<=c){
            if(a[i]<a[j]){
                temp[k]=a[i];i++;
            }
            else{
                temp[k]=a[j];j++;
            }
            k++;
        }
        while(i<=m){
            temp[k]=a[i];i++;k++;
        }
        
        while(j<=c){
            temp[k]=a[j];j++;k++;
        }
        for(i =b;i<=c;i++){
            a[i]=temp[i-b];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n];
        for(int i =0;i<n;i++)a[i]=sc.nextInt();
        mergeSort(0,n-1);
        System.out.println(Arrays.toString(a));
    }
}
