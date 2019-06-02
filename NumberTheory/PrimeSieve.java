/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberTheory;
import java.util.*;
/**
 *
 * @author Archit
 */
public class PrimeSieve {
    static boolean[] sieve;
    static void solve(){
        int l = sieve.length;
        sieve[0]=false;
        sieve[1]=false;
        sieve[2]= true;
        for(int i =3;i<l;i+=2){
           if(sieve[i]){
            for(int j = i*i;j>0 && j<Integer.MAX_VALUE && j<l;j+=2*i){
                sieve[j]=false;
            }   
           }   
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 86522069;
        sieve = new boolean[n+1];
        Arrays.fill(sieve, true);
        for(int i = 2;i<n;i+=2)sieve[i]=false;
        solve();
        int count = 1;
        for(int i =0;i<n;i++){
            if(sieve[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
