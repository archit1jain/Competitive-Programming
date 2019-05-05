
package bitwiseOperation;
import java.util.*;
/**
 *
 * @author Archit
 */
public class countbits {
   public static int count(int n){
       int count = 0;
       while(n!=0){
           n&=(n-1);
           count++;
       }
       return count;
   }
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int q = sc.nextInt();
       for(int i =0;i<q;i++){
           int a = sc.nextInt();
           int b = sc.nextInt();
           int ans =0;
           for(int j = a ; j <= b ; j++)ans+=count(j);
           System.out.println(ans);
       }
   }
}
