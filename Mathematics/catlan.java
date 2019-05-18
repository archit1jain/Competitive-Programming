/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics;
import java.util.*;
import java.math.*;
/**
 *
 * @author Archit
 */
public class catlan {
    public static BigDecimal roundBigDecimal(final BigDecimal input){
    return input.round(
        new MathContext(
            input.toBigInteger().toString().length(),
            RoundingMode.HALF_UP
        )
    );
}   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double res  = 1;
        for(int i =2;i<=n;i++){
            
            res*=(((double)(n+i))/(i));
        }
        System.out.println(Math.round(res));
    }
}
