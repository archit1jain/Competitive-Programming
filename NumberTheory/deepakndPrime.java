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
public class deepakndPrime {
    static boolean sieve[];
    public static void sieve(long n){
        Arrays.fill(sieve, true);
        int count = 1;
        if(n==1){
            System.out.println(2);
            return;
        }
        sieve[0]=sieve[1]=false;
        for(int i =4;i<sieve.length;i+=2)sieve[i]=false;
        for(int i = 3;i<sieve.length;i+=2){
            if(sieve[i]){
                count++;
                if(count==n)
                {System.out.println(i);return;}
                for(int j = i*i;j<sieve.length && j<Integer.MAX_VALUE && j>0;j+=2*i)
                    sieve[j]=false;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sieve = new boolean[100000000];
        sieve(n);
    }
}
