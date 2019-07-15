/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionBacktracking;

/**
 *
 * @author Archit
 */
import java.util.*;
public class cuusstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int count =0;
        int res = 0;
        for(int i = 0;i<b.length();i++){
            if(a.charAt(i)!=b.charAt(i))count++;
        }
        if(count%2==0) res++;
        for(int i = 1;i<=a.length()-b.length();i++){
            if(a.charAt(i-1)!=b.charAt(0))count--;
            if(a.charAt(i-1+b.length())!=b.charAt(b.length()-1))count++;
        }
    }
}
