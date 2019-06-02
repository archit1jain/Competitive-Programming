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
public class primeFactorization {
    static boolean sieve[];
    public static void sieve(){
        Arrays.fill(sieve, true);
        int l = sieve.length;
        sieve[0]=false;
        sieve[1]=false;
        for(int i =4;i<l;i+=2)sieve[i]=false;
        for(int i =3;i<l;i++){
            for(int j = i*i;j>0 && j<Integer.MAX_VALUE && j<l;j+=2*i){
                sieve[j]=false;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> l = new TreeSet<>();
        sieve = new boolean[n+1];
        sieve();
        int n1 = n;
        for(int i =1;(i*i)<=n && n1!=1;i++){
            if(sieve[i]){
            if(n1%i==0){l.add(i);
            while(n1%i==0){
                n1/=i;
            }
            }
          }
        }
        if(n1!=1)l.add(n1);
        System.out.println(l);
    }
}
