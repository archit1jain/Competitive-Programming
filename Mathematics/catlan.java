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
        BigDecimal res  = BigDecimal.ONE;
        for(int i =2;i<=n;i++){
            
            res=res.multiply((BigDecimal.valueOf(n+i).divide(BigDecimal.valueOf(i))));
        }
        System.out.println(res);
    }
}
