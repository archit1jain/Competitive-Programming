/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;
import java.util.*;

/**
 *
 * @author Archit
 */
public class StringSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextLine().trim();
        }
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i].compareTo(arr[j])>0 || arr[j].contains(arr[i])){
                    String temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
