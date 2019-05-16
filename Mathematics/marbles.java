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
    static BigInteger memo[];
    public static BigInteger fact(int n){
        if(memo[n]!=null) return memo[n];
        memo[n] = BigInteger.valueOf(n).multiply(fact(n-1));
        return memo[n];
     }
    
    public static void main(String[] arrgs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        memo = new BigInteger[1000000];
        memo[0]=BigInteger.ONE;
        for(int tt =0;tt<t;tt++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if( (n-k)<(k-1))
                //k=(n.subtract(k)).add(BigInteger.ONE);
                k=n-k+1;//selecting the smaller value
            if(k==1) 
                System.out.println(1);
            else{
                BigInteger res = BigInteger.ONE;
                /*
                for(BigInteger i =BigInteger.ONE;i.compareTo(k.subtract(BigInteger.ONE))<=0;i=i.add(BigInteger.ONE)){
                      res = (res.multiply(n.subtract(i))).divide(i);
                        */
                res = res.multiply(fact(n-1));
                res = res.divide(fact(k-1));
                res = res.divide(fact(n-k));
                System.out.println(res);
            }
        }
        }
    }
