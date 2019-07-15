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
public class FactoriZationGame {
    static int[] sieve;
    static void sieve(){
        sieve = new int[1000007];
        sieve[0]=0;
        sieve[1]=1;
        for(int i =2;i<sieve.length;i+=2)sieve[i]=2;
        for(int i =3;i<sieve.length;i+=2){
            if(sieve[i]==0){
                for(int j = i; j<Integer.MAX_VALUE && j>0 && j<sieve.length;j+=2*i){
                    sieve[j]=i;
                }
            }
        }
    }
    public static void main(String[] args){
        sieve();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        while(t!=0){
            int n = sc.nextInt();
            for(int i =0;i<n;i++){
                int key = sc.nextInt();
                while(key!=1){
                    set.add(sieve[key]);
                    key/=sieve[key];
                }
            }
            if((set.size()&1)==0){
                System.out.println("Liverbird");
            }
            else{
                System.out.println("Mancunian");
            }
            System.out.println(set);
            set.clear();
            t--;
        }
    }
}
