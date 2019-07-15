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
public class letsPlayGame {
    static int[] sieve;
    static long[] magic;
    static void sieve(){
        sieve[0]=0;
        sieve[1]=1;
        for(int i =2;i<sieve.length;i+=2) sieve[i]=2;
        for(int i = 3;i<sieve.length;i+=2){
            if(sieve[i]==0){
                for(int j =i;j<sieve.length;j+=2*i) sieve[j]=i;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sieve();
        magic[0]=magic[1]=0;
        for(int i =2;i<n;i++){
            magic[i]=
        }
    }
}
