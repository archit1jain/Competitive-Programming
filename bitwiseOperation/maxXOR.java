/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwiseOperation;
import java.util.*;
/**
 *
 * @author Archit
 */
public class maxXOR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max=Integer.MIN_VALUE;
        for(int i =x;i<y;i++){
            for(int j =i+1;j<y;j++){
                max  = Math.max(max,i^j);
            }
        }
    }
}
