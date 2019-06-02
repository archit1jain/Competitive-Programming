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
import java.math.*;
import java.util.*;
public class SegmentedPrimeSieve {
    static boolean[] second;
    static boolean[] first;
    static long a;
    static long b;
    public static void sieve(){
        int n = first.length;
        Arrays.fill(first, true);
        first[0]=false;
        first[1]=false;
        for(int i = 4;i<n;i+=2)first[i]=false;
        for(int i = 3;i<n;i+=2){
            if(first[i])
            for(int j = i*i;j>0 && j<Integer.MAX_VALUE && j<n;j+=2*i){
                first[j]=false;
            }
        }
    }
    public static void cal(){
        Arrays.fill(second, true);
        for(int i= 2;i*i<=b;i++){
            if(first[i]){    
            for(int j = 0;j<second.length;){
                    if(i==j+a) {
                        j++;
                        continue;
                    }
                    if((j+a)%i==0){
                        second[j]=false;
                        j+=i;
                        continue;
                    }
                    j++;
                  }
                }
            }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        first = new boolean[1000000];
        sieve();
        int t = sc.nextInt();
        for(int tt =0 ;tt<t;tt++){
        a = sc.nextLong();
        b = sc.nextLong();
        int n = (int)(b-a+1);
        second = new boolean[n+1];
        cal();
        for(int i =0;i<n;i++){
            if(second[i] && (i+a)!=1){
                System.out.println(i+a);
            }
        }
        System.out.println();
        }
    }
}
