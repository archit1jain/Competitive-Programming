
package bitwiseOperation;
import java.util.*;
/**
 *
 * @author Archit
 */
public class XORswapping {
    public static void main(String[] args){
        int a = 6;
        int b = 8;
        a = a^b;
        b=a^b;
        a = a^b;
        System.out.println(a +" " +b);
    }
}
