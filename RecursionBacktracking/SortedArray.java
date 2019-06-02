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
public class SortedArray {
    static boolean isSorted(int[] a, int i){
        if(i+1==a.length) return true;
        return a[i]<a[i+1] && isSorted(a,i+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++)a[i]=sc.nextInt();
        System.out.println(isSorted(a,0));
    }
}
