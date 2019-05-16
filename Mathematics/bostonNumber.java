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
public class bostonNumber {
    public static boolean isprim(int a ){
        for(int i =2;i*i<=a;i++){
            if(a%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        BigInteger b = new BigInteger(s);
        int n = 0;
        for(int i =0;i<s.length();i++)
            n+=Integer.parseInt(s.substring(i,i+1));
        for(int i =2;i<=n;i++){
            if(isprim(i)){
                while(b.mod(BigInteger.valueOf(i))==BigInteger.ZERO){
                    b=b.divide(BigInteger.valueOf(i));
                    n-=i;
                }
            }
        }
        if(n==0 && b.equals(BigInteger.ONE))
            System.out.println(1);
        else 
            System.out.println(0);
    }
}
