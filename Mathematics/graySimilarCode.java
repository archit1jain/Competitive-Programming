/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author Archit
 */
public class graySimilarCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=130){
            //PigeonHole Priciple;
            System.out.println("Yes");
        }
        else{
            BigInteger[] a = new BigInteger[n];
            for(int i =0;i<n;i++)a[i]=sc.nextBigInteger();
            for(int i =0;i<n;i++){
                for(int j =i+1;j<n;j++){
                    for(int k =j+1;k<n;k++){
                        for(int l =k+1;l<n;l++){
                            if((a[i].xor(a[j]).xor(a[k]).xor(a[l])).equals(BigInteger.valueOf(0))){
                                System.out.println("Yes");
                                return;
                            }
                        }
                    }
                }
            }
            System.out.println("No");
        }
    }
}
