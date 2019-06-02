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
public class TowerOfHanoi {
    static int[] a;
    static int count;
    public static void toh(int n,int source, int aux, int dest){
        if(n==1) {
            a[source]--;
            a[dest]++;
            System.out.println(Arrays.toString(a));
            count++;
            return;
        }
        toh(n-1,source,dest,aux);
        toh(1,source,aux,dest);
        toh(n-1,aux,source,dest);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        a = new int[3];
        int n = sc.nextInt();
        a[0]=n;
        count =0;
        System.out.println(Arrays.toString(a));
        toh(n,0,1,2);
        System.out.println(count);
        
    }
    
}
