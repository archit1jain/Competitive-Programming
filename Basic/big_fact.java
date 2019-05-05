/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author Archit
 */
public class big_fact {
    public static BigInteger[] b;
    private static BigInteger fact(int n){
        if(b[n]==null){
            b[n]=BigInteger.valueOf(n).multiply(fact(n-1));
            return b[n];
        }
        return b[n];    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        b = new BigInteger[n+1];
        b[0]=BigInteger.ONE;
        b[1] = BigInteger.ONE;
        System.out.println(String.valueOf(fact(n)).length());
        BigInteger v = new BigInteger("1000111101010101",2);
        System.out.println(v.bitCount());
    }
}
