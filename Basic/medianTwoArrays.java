/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;
import java.util.*;
/**
 *
 * @author Archit
 */
public class medianTwoArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i =0;i<n;i++)a[i]=sc.nextInt();
        for(int i =0;i<n;i++)b[i]=sc.nextInt();
        int[] c = new int[2*n];
        int k,i =0,j=0;
        for(k =0;k<2*n;k++){
            if(i<n && j<n)
                if(a[i]<b[j]){c[k]=a[i];i++;}
                else {c[k]=b[j];j++;}
            else{
                break;
            }
        }
        if(i<n){
            while(i<n){
                c[k]=a[i];i++;
            }
        }
        
        if(j<n){
            while(j<n){
                c[k]=b[j];j++;
            }
        }
        System.out.println((c[n-1]+c[n])/2);
    }
}
