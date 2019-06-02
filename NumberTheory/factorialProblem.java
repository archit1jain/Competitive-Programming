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
public class factorialProblem {
    static boolean[] sieve;
    static ArrayList<Integer> l1;
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
        
        for(int t =0;t<l;t++){
            if(sieve[t]){
                l1.add(t);
            }
        }
    }
    public static long cal(long n, long p, long c){
        int ans = 0;
        long d = p;
        while((n/d)!=0){
            ans+=(n/d);
            d*=p;
        }
        return (ans/c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sieve=new boolean[10000];
        l1= new ArrayList<>();
        sieve();
        int t = sc.nextInt();
        for(int tt =0;tt<t;tt++){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long k1 = k;
            int i =0;
            long p = l1.get(i);
            List<Long> prime = new ArrayList<>();
            long count = 0;
            while(p*p<=k){
                int c = 0;
                if(k1%p==0){
                    prime.add(p);
                    while(k1%p==0){
                        k1/=p;
                        c++;
                    }
                 count = Math.min(count, cal(n,p,c));   
                }
                i++;
                p = l1.get(i);
            }
            if(k1!=1){
                prime.add(k1);
                count = Math.min(count,cal(n,k1,1));
                
            }
            System.out.println(count);
            
            
        }
        
        
    }
}
