package Basic;

import java.math.BigInteger;
import java.util.*;
import javafx.util.Pair;
/**
 *
 * @author Archit
 */
public class basicoperations {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(32);
        System.out.println(s.peek());
        System.out.println(s.size());
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        map.put(2, new ArrayList<>());
        map.get(2).add(2);
        map.get(2).add(3);
        System.out.println(map.get(2));
        HashMap<Integer,Pair<Integer,Integer>> map1 = new HashMap<>();
        map1.put(2, new Pair(2,3));
        map1.put(3,new Pair(2,4));
        System.out.println(map1);
        System.out.println(map1.get(3).getKey());
        map1.put(3,new Pair(map1.get(3).getKey(),6));
        System.out.println(map1);
        BigInteger b1 = new BigInteger("10",2);
        System.out.println(b1);
        b1 = b1.shiftLeft(122);
        System.out.println(b1);
        b1 = b1.or(BigInteger.ONE);
        System.out.println(b1);
        System.out.println(~5);
        
    }
    
}
