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
public class phoneKeyPadAdvanced {
    static String searchIn [] = {
            "prateek", "sneha", "deepak", "arnav", "shikha", "palak",
            "utkarsh", "divyam", "vidhi", "sparsh", "akku"
    };
    static void print(String in,int i,String out){
        if(i==in.length()){
            for(int k = 0;k<searchIn.length;k++){
                if(searchIn[k].contains(out))
                    System.out.println(searchIn[k]);
            }
            return;
        }
        int digit = in.charAt(i)-'0';
        for(int j=0;j<keypad[digit].length();j++){
            String s2 = out+String.valueOf(keypad[digit].charAt(j));
            print(in,i+1,s2);
        }
    }
    static String[] keypad = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        print(in,0,"");
    }
}
