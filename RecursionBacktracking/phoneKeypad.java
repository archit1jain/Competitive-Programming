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
public class phoneKeypad {
    static void print(String in,int i,String out){
        if(i==in.length()){
            System.out.println(out);
            return;
        }
        int digit = in.charAt(i)-'0';
        for(int j=0;j<keypad[digit].length();j++){
            String s2 = out+String.valueOf(keypad[digit].charAt(j));
            print(in,i+1,s2);
        }
    }
    static String[] keypad = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        print(in,0,"");
    }
}
