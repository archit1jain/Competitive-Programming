package Mathematics;

/**
 *
 * @author Archit
 */
import java.util.*;
public class playingWithDivisors {
    public static int mod = 1000000007;
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x1 = 1;
        long[] a = new long[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextLong();
            x1 = (x1*(a[i]+1)+mod)%mod;
        } 
        extendedEuclid(2, mod);
        x1 = ((x1*x))%mod;
        long ans = 1;
        for(int i =0;i<n;i++){
            ans = (ans*((x1*a[i]+mod)%mod+1)+mod)%mod;
        }
        System.out.println((ans+mod)%mod);
    }
}