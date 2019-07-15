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
public class SumItUp {
    static boolean solve(int[] in, int n, int i,int k,int[] out){
        //BASE CASE
        if(i==n){
            if(k==0){
                for(int j =0;j<n;j++)
                    if(out[j]==1) System.out.print(in[j]+" ");
                System.out.println();
            }
            return true;
        }
        
        //RECURSIVE
        boolean c = solve(in,n,i+1,k,out);
        out[i]=1;
        boolean b = solve(in,n,i+1,k-in[i],out);
        out[i]=0;
        return b || c;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int k = sc.nextInt();
        int[] out = new int[n];
        boolean b = solve(a,n,0,k,out);
    }
}
