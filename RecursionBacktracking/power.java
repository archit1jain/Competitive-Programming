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
public class power {
    static int pow(int a, int b){
        if(b==0) return 1;
        int ans = pow(a,b/2);
        ans = ans*ans;
        if((b&1)==0) return ans;
        else return a*ans;
    }
    static int pow1(int a, int b){
        int ans = 1;
        while(b!=0){
            if((b&1)==1)
                ans*=a;
            a*=a;
            b>>=1;
        }
        return ans;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(pow(a,b));
        System.out.println(pow1(a,b));
    }
}
