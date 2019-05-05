package bitwiseOperation;
import java.util.*;
/**
 *
 * @author Archit
 */
public class unique2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int x=0;
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
            x^=a[i];
        }
        int i =0;
        while(x>=0){
            if((x&1)==1) break;
            i++;
            x>>=1;
        }
        int b=0,c=0;
        int l = 1<<i;
        for(int j =0;j<n;j++){
            if((a[j]|l)==a[j])b^=a[j];
            else c^=a[j];
        }
        if(b>c)System.out.println(c + " " + b);
        else System.out.println(b+" "+c);
    }
}
    