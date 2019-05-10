/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics;
import java.text.DecimalFormat;
import java.util.*;
/**
 *
 * @author Archit
 */
public class favDICE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tt=0;tt<t;tt++){
            int n = sc.nextInt();
            double ans = 0.00;
            for(int i =1;i<=n;i++){
                ans+=(double)1/i;
            }
            ans*=n;
            DecimalFormat dec = new DecimalFormat("#0.00");
            System.out.println(dec.format(ans));
        }
    }
}
