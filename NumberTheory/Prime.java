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
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1) {System.out.println("Not prime");return;}
        for(int i =2;i*i<=n;i++){
            if(n%i==0){System.out.println("not prime");return;}
            
        }
        System.out.println("prime");
    }
}
