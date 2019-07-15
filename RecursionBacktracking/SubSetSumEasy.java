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
public class sol {
    static boolean check(int[] a, int i, int sum,int count){
        if(i==a.length && sum == 0 && count>0) return true;
        if(i==a.length && sum==0 && count==0) return false;
        if(i==a.length && sum!=0) return false;
        return check(a,i+1,sum+a[i],count+1) || check(a,i+1,sum,count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i =0;i<n;i++)a[i]=sc.nextInt();
            if(check(a,0,0,0)) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
