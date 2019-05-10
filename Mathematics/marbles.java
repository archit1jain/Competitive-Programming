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
import java.math.BigInteger;
import java.util.*;
public class marbles {
    
    public static void main(String[] arrgs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tt =0;tt<t;tt++){
            BigInteger n = sc.nextBigInteger();
            BigInteger k = sc.nextBigInteger();
            if( (n.subtract(k)).compareTo(k.subtract(BigInteger.ONE))<0)
                k=(n.subtract(k)).add(BigInteger.ONE);//selecting the smaller value
            if(k==BigInteger.ONE) 
                System.out.println(1);
            else{
                BigInteger res = BigInteger.ONE;
                for(BigInteger i =BigInteger.ONE;i.compareTo(k.subtract(BigInteger.ONE))<=0;i=i.add(BigInteger.ONE)){
                    res = (res.multiply(n.subtract(i))).divide(i);
                }
                System.out.println(res);
            }
        }
    }
}
