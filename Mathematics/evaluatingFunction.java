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
public class evaluatingFunction {
    public static BigInteger pow(BigInteger b, int pow){
        if(pow==0) return BigInteger.ONE;
        BigInteger ans = pow(b,pow/2);
        ans=ans.multiply(ans);
        if(pow%2==0) return ans;
        else return ans.multiply(b);
    }
    public static BigInteger con(int n,BigInteger b){
        return (BigInteger.valueOf(n)).multiply(b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        /*
        f(x)=3x2-x+10
        g(x)=4x3+2x2-5x+4.
        */
        BigInteger ans = con(4,pow(n,3)).add(con(5,pow(n,2))).add(con(-6,pow(n,1))).add(con(14,pow(n,0)));
        System.out.println(ans);
        
    }
}
