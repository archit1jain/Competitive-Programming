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
public class fastModuloBitmasl {
    public static void solve(long a, long b,long m){
        long res = 1;
        while(b!=0){
            if((b&1)==1)
                res=(res*a)%m;
            a=(a*a)%m;
            b>>=1;
        }
        System.out.println(res);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long m = sc.nextLong();
        solve(a,b,m);
    }
}
