/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

/**
 *
 * @author Archit
 */
import java.util.*;
public class JobForBounties {
    public static int solve(String s){
        int l = s.length();
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int result = 0;
        for(int i  = 0;i<l;i++){
            if(s.charAt(i)=='(')
                st.push(i);
            else{
                st.pop();
                if(!st.empty()){
                    result=Math.max(result,i-st.peek());
                }
                else st.push(i);
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
    }
}
