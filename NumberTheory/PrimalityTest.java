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
public class PrimalityTest {
    static long pow(long a, long n, long p){
        long res = 1;
        a%=p;
        while(n!=0){
            if((n&1)==1){
                res = (res*a)%p;
            }
            a = (a*a)%p;
            n>>=1;
        }
        return res;
    }
    static boolean isprime(long n){
        if(n<=1 || n==4) return false;
        if(n<=3) return true;
        int itr = 10;
        while(itr-->0){
            long a = 2 + (long)(Math.random()%(n-4));
            if(pow(a,n-1,n)!=1)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextInt();
            if(isprime(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
