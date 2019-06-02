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
public class ExtendedEuclid {
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static int lcm(int a,int b){
        return ((a*b)/gcd(a,b));
    }
    static int x,y,GCD;
    public static void extendedEuclid(int a, int b){
        
        if(b==0){
            x =1;y = 0;GCD = a;return;
        }
        extendedEuclid(b,a%b);
        int cx = y;
        int cy = x-(a/b)*y;
        System.out.println(cx + " and " +cy);
        x = cx;
        y = cy;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //System.out.println(gcd(a,b));
        //System.out.println(lcm(a,b));
        extendedEuclid(18,30);
        System.out.println(x + " and " + y);
    }
}
