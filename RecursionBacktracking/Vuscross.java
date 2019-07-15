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
public class Vuscross {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        double[] a= new double[n];
        int[][] b = new int[n][2];
        for(int i = 0;i<n;i++){
            a[i]=sc.nextDouble();
            b[i][0]=(int)Math.floor(a[i]);
            b[i][1]=(int)Math.ceil(a[i]);
            sum+=b[i][0];
        }
        int i = 0;
        while(sum!=0 && i<n){
            if(b[i][0]!=b[i][1]){
            sum++;b[i][0]++;
        }  
            i++;
            
        }
        StringBuffer br = new StringBuffer();
        for(i = 0;i<n;i++){
            br.append(b[i][0]+"\n");
        }
        System.out.println(br);
    }
}
