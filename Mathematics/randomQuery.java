/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics;

/**
 *
 * @author Archit
 */
import java.text.DecimalFormat;
import java.util.*;
public class randomQuery {
    public static long[] ans;
    public static int[] last;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ans = new long[n+1];
        last = new int[1000001];
        ans[0]=0;
        double sum=0;
        for(int i =1;i<=n;i++){
            int key = sc.nextInt();
            ans[i]=ans[i-1]+(i-last[key]);
            last[key] = i;
            sum+=ans[i];
        }
        sum = 2*sum-n;
        sum/=(double)Math.pow(n,2);
        DecimalFormat format = new DecimalFormat("#0.000000");
        System.out.println(format.format(sum));
        
    }
}
