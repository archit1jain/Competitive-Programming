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
public class LinearSearch {
    static boolean linearSerach(int[] a,int r, int i){
        if(i+1==a.length){
            if(a[i]==r) return true;
            else return false;
        }
        if(a[i]==r) return true;
        return linearSerach(a,r,i+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++)a[i]=sc.nextInt();
        System.out.println(linearSerach(a,r,0));
    }
}
