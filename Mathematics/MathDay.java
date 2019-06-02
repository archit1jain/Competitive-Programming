/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    public static int[][] mul(int[][] a, int[][] b){
        int[][] ans = new int[2][2];
        ans[0][0]=(a[0][0]*b[0][0]+a[0][1]*b[1][0])%mod;
        ans[0][1]=(a[0][0]*b[0][1]+a[0][1]*b[1][1])%mod;
        ans[1][0]=(a[1][0]*b[0][0]+a[1][1]*b[1][0])%mod;
        ans[1][1]=(a[1][0]*b[0][1]+a[1][1]*b[1][1])%mod;
        return ans;
    }
    public static int[][] matpow(int[][] mat,int p){
        if(p==0) {
            int[][] a = {{0,1},{1,0}};
            return a;
        }
        int[][] ans = matpow(mat,p/2);
        ans = mul(ans,ans);
        if((p&1)==0) return ans;
        else return mul(mat,ans);
    }
    
    public static int fact(int p,int mod){
        int[][] trans = {{0,1},{1,1}};
        int[] f = {1,1};
        trans = matpow(trans,p-1);
        
        
        
    }*/
    
package Mathematics;

/**
 *
 * @author Archit
 */
import java.util.*;
public class MathDay {
    static int mod;
    static int pow[];
    public static int pow(int a, int p){
        if(pow[p] != 0) return pow[0];
        int ans = pow(a,p/2)%mod;
        ans=(ans%mod*ans%mod)%mod;
        if((p&1)==1){
            ans=(a*ans)%mod;
        }
        pow[p]=ans;
        return pow[p];
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        pow =  new int [100007];
        pow[0]=1;
        for(int tt = 0; tt<t ; tt++){
            int a = sc.nextInt();
            int n = sc.nextInt();
            int p = sc.nextInt();
            mod = p;
            int ans = 1;
            for(int i =1;i<=n;i++){
                ans = (ans%mod*pow(a,i)%mod)%mod;
            }
            System.out.println(ans%mod);
        }   
    }
}
