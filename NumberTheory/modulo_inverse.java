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
public class modulo_inverse {
    static long mod = 7;
    static long x,y,gcd;
    static void extendedeuclid(long a,long b){
        if(b==0){
            x = 1;y=0;gcd=a;return;
        }
        extendedeuclid(b,a%b);
        long cx = y;
        long cy = x-(a/b)*y;
        x = cx;
        y = cy;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        extendedeuclid(n,mod);
        System.out.println((x+mod)%mod);
    }
}
