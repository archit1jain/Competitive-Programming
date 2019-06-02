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
public class magicTriplet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tt = 0;tt<t;tt++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i =0;i<n;i++)a[i]=sc.nextInt();
            int count = 0;
            for(int i =0;i<n;i++)
                for(int j = i+1;j<n;j++)
                    for(int k = j+1;k<n;k++)
                        if(a[i]<a[j] && a[j]<a[k])count++;
            System.out.println(count);
        }
       
    }
}
