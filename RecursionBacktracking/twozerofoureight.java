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
public class twozerofoureight {
    static String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};;
    public static void solve(int n){
        if(n==0) return;
        solve(n/10);
        System.out.print(words[n%10]+ " ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
    }
}
