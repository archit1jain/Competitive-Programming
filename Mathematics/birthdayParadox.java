/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics;
import java.util.*;
/**
 *
 * @author Archit
 */
public class birthdayParadox {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        if(p==1){System.out.println(366);return;}
        int ans = 1;
        double prob = 1;
        while(1-prob<=p){
            prob*=(double)(365-ans)/365;
            ans++;
        }
        System.out.println(ans);
    }
}
