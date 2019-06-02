/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionBacktracking;

import java.util.Scanner;

/**
 *
 * @author Archit
 */
public class incdec {
    public static void inc(int n){
        if(n==0) return;
        inc(n-1);
        System.out.print(n+ " ");
    }
    public static void dec(int n){
        if(n==0) return;
        System.out.print(n+ " ");
        dec(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inc(n);
        System.out.println();
        dec(n);
                
    }
}
