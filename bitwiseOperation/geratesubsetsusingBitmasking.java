package bitwiseOperation;
import java.util.*;
/**
 *
 * @author Archit
 */
public class geratesubsetsusingBitmasking {
    public static void generateSubset(char[] a){
        int l = a.length;
        int range = (1<<l) - 1;
        for(int i =0;i<=range;i++){
            filterchar(a,i);
        }
    }
    public static void filterchar(char[] a, int n){
        int i =0;
        while(n>0){
            int b = n&1;
            if(b==1)System.out.print(a[i]);
            i++;
            n=n>>1;
        }
        System.out.println();
        
    }
    public static void main(String[] args){
        String s = "abc";
        generateSubset(s.toCharArray());
    }
}
