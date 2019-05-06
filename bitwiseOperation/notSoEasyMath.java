/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwiseOperation;
import java.util.*;
import java.math.*;
/**
 *
 * @author Archit
 */
public class notSoEasyMath {
    static int[] prime = {2,3,5,7,11,13,17,19};
    static BigInteger b1;
    static BigInteger ans;
    public static void generate(){
        int l = prime.length;
        int range = (1<<l)-1;
        for(int i =0;i<=range;i++){
            solve(i);
        }
        System.out.println(ans);
    }
    public static void solve(int n){
        BigInteger b2 = BigInteger.ONE;
        int i =0,count=0;
        while(n!=0){
            if((n&1)==1){b2=b2.multiply(BigInteger.valueOf(prime[i]));count++;}
            n>>=1;
            i++;
        }
        if(count>=1){
            if(b2.compareTo(b1)<=0){
            if(count%2==1){
            BigInteger b3 = ((b1.subtract(b2)).divide(b2)).add(BigInteger.ONE);
            ans = ans.add(b3);
            }
            else{
                BigInteger b3 = b1.subtract(b2);
                b3=b3.divide(b2);
                b3 = b3.add(BigInteger.ONE);
                ans = ans.subtract(b3);
            //ans = ans.subtract(BigInteger.valueOf(count-1).multiply(((b1.subtract(b2)).divide(b2)).add(BigInteger.ONE)));
            }
        }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
        b1 = sc.nextBigInteger();
        ans = BigInteger.ZERO;
        generate();
        }
    }
}
