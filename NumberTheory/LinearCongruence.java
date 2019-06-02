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
import java.math.*;
import java.util.*;
public class LinearCongruence {
    public static BigInteger gcd(BigInteger a,BigInteger b){
        if(b.equals(BigInteger.ZERO)) return a;
        return gcd(b,a.mod(b));
    }
    static BigInteger x,y,gcd;
    public static void ee(BigInteger a,BigInteger b){
        if(b.equals(BigInteger.ZERO)){
            x=BigInteger.ONE;
            y = BigInteger.ZERO;
            gcd = a;
            return;
        }
        ee(b,a.mod(b));
        BigInteger cx = y;
        BigInteger cy = x.subtract((a.divide(b)).multiply(y));
        x = cx;
        y = cy;
    }
    public static BigInteger inv(BigInteger a,BigInteger m){
        ee(a,m);
        return x;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] num = new BigInteger[n];
        BigInteger[] rem = new BigInteger[n];
        BigInteger prod = BigInteger.ONE;
        for(int i =0;i<n;i++){num[i]=sc.nextBigInteger();prod=prod.multiply(num[i]);}
        for(int i = 0;i<n;i++)rem[i]=sc.nextBigInteger();
        BigInteger ans = BigInteger.ZERO;
        for(int i =0;i<n;i++){
            //int pp = prod.divide(num[i]);
            //int inv = inv(pp,num[i]);
            //ans = (ans).add( (rem[i].multiply(pp).multiply(inv)).mod(prod));
            BigInteger pp = prod.divide(num[i]);
            BigInteger inv = inv(pp,num[i]);
            ans = ((ans.mod(prod)).add(((rem[i].multiply(pp)).multiply(inv)).mod(prod))).mod(prod);
        
        }
        System.out.println(ans);
    }
}
