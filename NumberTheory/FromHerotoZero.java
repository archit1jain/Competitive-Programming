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
public class FromHerotoZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long p = sc.nextLong();
            long count = 0;
            while(n!=0){
                if(n%p==0){
                    n/=p;
                    count++;
                }
                else{
                    count+=(n%p);
                    n-=(n%p);
                }
            }
            System.out.println(count);
        }
    }
}
