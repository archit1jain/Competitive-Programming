package Basic;

import java.util.*;
/**
 *
 * @author Archit
 */
public class unlock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++)a[i]=sc.nextInt();
        int j =0;
        while(k!=0 && j<n){
            if(a[j]==n-j)j++;
            else{
            if(j==n)break;            
            int i = j;
            while(a[i]!=n-j){
                i++;
            }
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
            k--;
            }
        }
        for(int i =0;i<n;i++)System.out.print(a[i]+" ");
        
    }
}
