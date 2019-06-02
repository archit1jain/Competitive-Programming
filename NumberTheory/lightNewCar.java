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
import java.util.*;
public class lightNewCar {
    static long mod = 1000000007;
    public static long cal(String s){
        long res = 0;
        for(int i =0;i<s.length();i++){
            res *=10;
            res+=Integer.parseInt(s.substring(i,i+1));
            res%=mod;
        }
        return res;
    }
    public static long pow(long a,long b){
        long res = 1;
        while(b!=0){
            if((b&1)==1){
                res=(res*a)%mod;
            }
            a=(a*a)%mod;
            b>>=1;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tt = 0; tt<t; tt++){            
        String a = sc.next();
        String b = sc.next();
        System.out.println(pow(cal(a),cal(b)));

        }    
    }
}
