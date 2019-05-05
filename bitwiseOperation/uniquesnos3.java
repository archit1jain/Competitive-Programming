package bitwiseOperation;
import java.util.*;
/**
 *
 * @author Archit
 */
public class uniquesnos3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++)a[i]=sc.nextInt();
        int[] b = new int[64];
        for(int i =0;i<n;i++){
            int j =0;
            while(a[i]!=0){
                b[j]+=(a[i]&1);
                a[i]>>=1;
                j++;
            }
        }
        int ans =0;
        for(int i =0;i<64;i++){
            ans+=(b[i]%3)*(1<<i);
        }
        System.out.println(ans);
    }
}
