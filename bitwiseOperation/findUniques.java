package bitwiseOperation;

/**
 *
 * @author Archit
 */
public class findUniques {
    public static void main(String[] args){
        int[] a = {2,4,2,5,6,5,4};
        int b=0;
        for(int i =0;i<a.length;i++)b^=a[i];
        System.out.println(b);
    }
    
}
