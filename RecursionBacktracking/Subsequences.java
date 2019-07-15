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
public class Subsequences {
    public static void print(String s,int i){
        if(i==s.length()) {System.out.print(s+",");return;}
        print(s,i+1);
        print(s.substring(0,i)+s.substring(i+1),i);
    }
    public static void print2(String s){
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        print(s,0);
    }
}
