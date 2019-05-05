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
public class julka {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = 10;
        while(t!=0){
            t--;
            BigInteger n = sc.nextBigInteger();
            BigInteger k = sc.nextBigInteger();
            BigInteger x = (n.subtract(k)).divide(BigInteger.valueOf(2));
            System.out.println(n.subtract(x));
            System.out.println(x);
        }
    }
}
