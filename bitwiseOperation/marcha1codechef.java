package bitwiseOperation;
import java.util.*;
/**
 *
 * @author Archit
 */
public class marcha1codechef {
    public static boolean solve(int n, int m, int[] a){
        if(m==0) return true;
        int l = a.length;
        int range = (1<<l)-1;
        for(int i =0;i<=range;i++){
            if(m == subs(a,i)) return true;
        }
        return false;
    }
    public static int subs(int[] a,int k){
        int sum =0;
        int l = a.length;
        int i =0;
        while(i!=l){
            if((k&1)==1)sum+=a[i];
            i++;
            k>>=1;
        }
        return sum;
    }
    
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     for(int i =0;i<t;i++){
         int n = sc.nextInt();
         int m = sc.nextInt();
         int[] a = new int[n];
         for(int j =0;j<n;j++)a[j]=sc.nextInt();
         if(solve(n,m,a))System.out.println("Yes");
         else System.out.println("No");
     }
 }   
}
