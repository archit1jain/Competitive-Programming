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
public class BinarySearch {
    static boolean binarySearch(int[] a, int l, int r, int key){
        int m = (l+r)/2;
        if(l>=r) return false;
        if(a[m]==key) return true;
        if(key>a[m]) return binarySearch(a,m+1,r,key);
        else return binarySearch(a,l,m-1,key);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)a[i]=sc.nextInt();
        int key = sc.nextInt();
        System.out.print(binarySearch(a,0,n,key));
    }
}
