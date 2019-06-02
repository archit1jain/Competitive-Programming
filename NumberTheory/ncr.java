package NumberTheory;


/**
 *
 * @author Archit
 */
import java.math.BigInteger;
import java.util.*;
public class ncr {
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    static int x,y,GCD;
    public static void extendedEuclid(int a, int b){
        
        if(b==0){
            x =1;y = 0;GCD = a;return;
        }
        extendedEuclid(b,a%b);
        int cx = y;
        int cy = x-(a/b)*y;
        x = cx;
        y = cy;
    }
    public static long mod = 1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long r = sc.nextLong();
        long ans = n;
        for(int i = 2;i<=r;i++){
        ans = ((ans*(n-i+1))+mod)%mod;
        extendedEuclid(i,(int)mod);
        ans = ((ans%mod)*(x%mod))%mod;
        // ans = (ans.multiply(BigInteger.valueOf(n-i+1)));
        // ans = ans.divide(BigInteger.valueOf(i));
         //ans = (ans.add(mod)).mod(mod);
        }
        System.out.println((ans+mod)%(mod));
    }
}
