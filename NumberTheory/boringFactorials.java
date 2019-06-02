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
public class boringFactorials {
    public static long expo(long a,long b,long m){
        long res = 1;
        while(b!=0){
            if((b&1)==1) res=(res*a)%m;
            a=(a*a)%m;
            b>>=1;
        }
        return res%m;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tt = 0; tt < t ; tt++){
            long n = sc.nextLong();
            long p = sc.nextLong();
            if(n>=p){
                System.out.println(0);
            }
            else{
                long ans = -1;
                for(long i = n+1;i <= p-1;i++){
                    ans=(ans*expo(i,p-2,p))%p;
                }
                System.out.println((ans+p)%p);
            }
        }
    }
}
