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
    static int[] sieve;
    static void sieve(){
        sieve = new int[100007];
        sieve[0]=0;
        sieve[1]=0;
        for(int i =2;i<sieve.length;i+=2){
            sieve[i]=2;
        }
        for(int i =3;i<sieve.length;i+=2){
            if(sieve[i]==0)
            for(int j = i;j<Integer.MAX_VALUE && j>0 && j<sieve.length;j+=2*i){
                sieve[j]=i;
            }
        }
    }
    static int[] factors;
    static void finddiv(int b){
        for(int i =1;i*i<=b;i++){
            if(b%i==0){
                factors[i]++;
                if(i!=b/i)factors[b/i]++;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factors = new int[1000007];
        for(int i =0;i<n;i++){
            int key = sc.nextInt();
            finddiv(key);
            }
        int q = sc.nextInt();
        for(int i =0;i<q;i++){
            int k = sc.nextInt();
            System.out.println(factors[k]);
        }
    }
}
