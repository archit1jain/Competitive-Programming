
package NumberTheory;

/**
 *
 * @author Archit
 */
import java.util.*;
public class numberOfDivisors {
    public static long[] sieve;
    public static long mod = 1000000007;
    public static void sieve(){
        sieve[0]=1;
        sieve[1]=1;
        for(int i = 2;i<1000007;i+=2)sieve[i]=2;
        for(int i = 3;i<1000007;i+=2){
            if(sieve[i]==0){
             for(int j = i;j<sieve.length && j<Integer.MAX_VALUE;j+=2*i){
                 sieve[j]=i;
             }   
            }
        }
    }
    public static void main(String[] args){   
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       sieve = new long[1000007];
       sieve();
       for(int tt = 0 ; tt<t; tt++){
           int n = sc.nextInt();
           long[] a = new long[n];
           long max = 0;
           for(int i =0;i<n;i++){
               a[i]=sc.nextLong();
               max = Math.max(a[i], max);
           }
           long[] ans = new long[(int)(max+1)];
           for(int i=0;i<n;i++){
               while(a[i]!=1){
                   ans[(int)sieve[(int)(a[i])]]++;
                   a[i]=a[i]/sieve[(int)(a[i])];
               }
           }
           long ans1 = 1;
           for(int i =0;i<=max;i++){
               ans1 = (ans1*(ans[i]+1))%mod;
           }
           System.out.println(ans1);
       }
   } 
}
