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
import java.math.*;
public class fastFibnocci_1 {
    static long mod =1000000007;
    public static long[][] tr=  {{0,1},{1,1}};
    public static long[][] mul(long[][] a,long[][] b){
        long ans[][] = new long[2][2];
        ans[0][0] = ((a[0][0]*(b[0][0]))+(a[0][1]*(b[1][0])))%(mod);
        ans[0][1] = ((a[0][0]*(b[0][1]))+(a[0][1]*(b[1][1])))%(mod);
        ans[1][0] = ((a[1][0]*(b[0][0]))+(a[1][1]*(b[1][0])))%(mod);
        ans[1][1] = ((a[1][0]*(b[0][1]))+(a[1][1]*(b[1][1])))%(mod);  
        return ans;
    }
    /*public static BigInteger[][] mul1(BigInteger[][] b){
        BigInteger ans[][] = new BigInteger[2][2];
        ans[0][0] = ((b[0][0]*(b[0][0]))+(b[0][1]*(b[1][0]))).mod(mod);
        ans[0][1] = ((b[0][0]*(b[0][1]))+(b[0][1]*(b[1][1]))).mod(mod);
        ans[1][0] = ((b[1][0]*(b[0][0]))+(b[1][1]*(b[1][0]))).mod(mod);
        ans[1][1] = ((b[1][0]*(b[0][1]))+(b[1][1]*(b[1][1]))).mod(mod);  
        return ans;
    }
    */
    public static long[][] pow(long p){
        if(p==0){
            long[][] I = {{0,1},{1,0}};
            return I;
        } 
        long[][] ans = pow(p/2);
        long ans1[][] = new long[2][2];
        ans1[0][0] = ((ans[0][0]*(ans[0][0]))+(ans[0][1]*(ans[1][0])))%(mod);
        ans1[0][1] = ((ans[0][0]*(ans[0][1]))+(ans[0][1]*(ans[1][1])))%(mod);
        ans1[1][0] = ((ans[1][0]*(ans[0][0]))+(ans[1][1]*(ans[1][0])))%(mod);
        ans1[1][1] = ((ans[1][0]*(ans[0][1]))+(ans[1][1]*(ans[1][1])))%(mod);
        //ans = mul1(ans);
        if(p%2==0) return ans1;
        else return mul(tr,ans1);
        
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        long[] f1 = {1,1};
        for(int i =0;i<t;i++){
            long b = sc.nextLong();
            long[][] trans = pow(b-1);
            long ans = (trans[0][0]*(f1[0]))+(trans[0][1]*(f1[1]));
            System.out.println(ans%(mod));
        }
        
    }
}
