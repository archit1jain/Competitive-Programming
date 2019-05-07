
package Mathematics;
import java.util.*;
/**
 *
 * @author Archit
 */
public class fastExponentiation {
    static int[] memo;
    public static int pow(int a,int b){
        if(memo[b]!=0) return memo[b];
        memo[b/2]=pow(a,b/2);
        if(b%2==0) return memo[b/2]*memo[b/2];
        else return a*memo[b/2]*memo[b/2];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        memo = new int[b+1];
        memo[0]=1;
        System.out.println(pow(a,b));
    }
}
