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
public class diceRollExpectation {
    public static void main(String[] args){
        double ans = 0;
        for(int i =1;i<=6;i++){
            ans+=(double)1/i;
        }
        ans*=6;
        System.out.println(Math.round(ans));
    }
}
