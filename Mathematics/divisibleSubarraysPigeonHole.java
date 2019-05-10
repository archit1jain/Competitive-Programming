package Mathematics;
import java.util.*;
/**
 *
 * @author Archit
 */
public class divisibleSubarraysPigeonHole {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tt =0;tt<t;tt++){
            int n = sc.nextInt();
            long sum =0;
            int[] prefix = new int[n];
            prefix[0]=1;
            for(int i =0;i<n;i++){     
                sum+=sc.nextLong();
                int b = (int) ((sum+n)%n);
                prefix[b]++;
            }
            long ans = 0;
            for(int i =0;i<n;i++){
                ans+= (prefix[i]*(prefix[i]-1))/2;
            }
            System.out.println(ans);
            
        }
    }
}
