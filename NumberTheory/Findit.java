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
public class Findit {
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++)a[i]=sc.nextInt();
        int q = sc.nextInt();
        for(int i =0;i<q;i++){
            int k = sc.nextInt();
            int ans = 0;
            for(int j =0;j<n;j++){
                if(a[j]%k==0)ans++;
            }
            System.out.println(ans);
        }
    }
}
