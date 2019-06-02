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
public class sumsums {
    public static long pow[];
    public static long pow(int n,int p){
        if(pow[p]!=0) return pow[p];
        long ans = pow(n,p/2);
        ans = ((ans%mod)*(ans%mod))%mod;
        if((p&1)==0){
        pow[p]=ans;
        }
        else{
        pow[p]=(n*ans)%mod;        
        }
        return pow[p];
    }
    static long mod = 98765431;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for(int i =0;i<n;i++){a[i]=sc.nextInt();sum = (sum+a[i])%mod;}
            t++;
            pow = new long[t];
            pow[0]=1;
            long[] coeff = new long[t];
            coeff[0]=1;
            if(t%2==0)coeff[t-1]=-1;
            else coeff[t-1]=1;
            long ans = ((pow(n,t-2))%mod * sum%mod)%mod;
            for(int i = 1;i<t-1;i++){
                coeff[i]=-((coeff[i-1]*(t-i))/i)%mod;
                ans = (ans%mod + ((pow(n,t-i-2))*(sum)*(coeff[i]))%mod);
            }
            
            /*for(int j =0;j<n;j++){
            long ans = 0;
            for(int i =0;i<t-1;i++){
                ans=ans+(pow(n,t-i-2)*sum*coeff[i])%mod;
            }
            long key = (ans+((coeff[t-1]*a[j])%mod));
            if(key>0) a[j]=key;
            else a[j]= (key+mod)%mod;
            }
                    */
        for(int i =0;i<n;i++)
        System.out.println(((ans%mod+(coeff[t-1]*a[i])%mod)%mod));
    }
}
