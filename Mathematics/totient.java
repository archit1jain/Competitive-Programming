/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics;

/**
 *
 * @author Archit
 */
import java.util.*;
public class totient {
    static int[] sieve;
    public static void sieve(){
        sieve[0]=0;
        sieve[1]=0;
        for(int i =2;i<sieve.length;i+=2)
            sieve[i]=2;
        for(int i = 3;i<sieve.length;i+=2){
            if(sieve[i]==0){
                for(int j = i; j<sieve.length;j+=2*i)
                    sieve[j]=i;
            }
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sieve = new int[1000007];
        sieve();
        for(int tt = 0 ; tt<t ; tt++){
            int n = sc.nextInt();
            int ans = n;
            while(n!=1){
               int f = sieve[n];
                ans = (ans*(f-1))/f;
               while(n%f==0){
                   n/=f;
               }
            }
            System.out.println(ans);
            
        }
    }
}
