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
public class fastFibnocci {
    static BigInteger mod = BigInteger.valueOf(1000000007);
    public static BigInteger[][] mul(BigInteger[][] a,BigInteger[][] b){
        BigInteger ans[][] = new BigInteger[2][2];
        ans[0][0] = ((a[0][0].multiply(b[0][0])).add(a[0][1].multiply(b[1][0]))).mod(mod);
        ans[0][1] = ((a[0][0].multiply(b[0][1])).add(a[0][1].multiply(b[1][1]))).mod(mod);
        ans[1][0] = ((a[1][0].multiply(b[0][0])).add(a[1][1].multiply(b[1][0]))).mod(mod);
        ans[1][1] = ((a[1][0].multiply(b[0][1])).add(a[1][1].multiply(b[1][1]))).mod(mod);  
        return ans;
    }
    
    public static BigInteger[][] pow(BigInteger[][] a,BigInteger p){
        if(p==BigInteger.ZERO){
            BigInteger[][] I = {{BigInteger.ZERO,BigInteger.ONE},{BigInteger.ONE,BigInteger.ZERO}};
            return I;
        } 
        BigInteger[][] ans = pow(a,p.divide(BigInteger.valueOf(2)));
        ans = mul(ans,ans);
        if(p.mod(BigInteger.valueOf(2))==BigInteger.ZERO) return ans;
        else return mul(a,ans);
        
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        BigInteger[] f1 = {BigInteger.ONE,BigInteger.ONE};
        BigInteger[][] tr = {{BigInteger.ZERO,BigInteger.ONE},{BigInteger.ONE,BigInteger.ONE}};
        for(int i =0;i<t;i++){
            BigInteger b = sc.nextBigInteger();
            BigInteger[][] trans = pow(tr,b.subtract(BigInteger.ONE));
            BigInteger ans = (trans[0][0].multiply(f1[0])).add(trans[0][1].multiply(f1[1]));
            System.out.println(ans.mod(mod));
        }
        
    }
}
