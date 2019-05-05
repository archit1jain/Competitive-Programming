
package bitwiseOperation;
import java.util.*;
/**
 *
 * @author Archit
 */
public class minBitsneedtochange {
    public static boolean ithbit(int n,int k){
        return (n & (1<<k)) >= 1 ;
    }
    public static int setithhbit(int n,int k){
        return (n | (1<<k)); 
    }
    
    public static int clearithbit(int n,int k){
        return (n & ~(1<<k)); 
    }
    public static void main(String[] args){
        int a = 16;
        int b = 15;
        a = a^b;
        int count = 0;
        while(a!=0){
            a&=a-1;
            count++;
        }
        System.out.println(count);
        System.out.println(ithbit(b,2));
        System.out.println(setithhbit(15,5));
        System.out.println(clearithbit(15,2));
    }
}
