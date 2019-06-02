/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionBacktracking;

/**
 *
 * @author Archit
 * 
 */
import java.util.*;
public class multiplyRecursion {
    public static int prod(int a, int b){
        if(a<b) return prod(b,a);
        if(b==0) return 0;
        return (a + prod(a,b-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(prod(a,b));
    }
}
