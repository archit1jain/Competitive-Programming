package bitwiseOperation;

import java.util.*;

/**
 *
 * @author Archit
 */
public class tavasandSadda {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1= n/10;
        int x = 1;
        int ans=0;
        if(n%10==7)ans+=x;
        while(n1!=0){
            x=x<<1;
            if(n1%10==7)ans+=x;
            ans+=x;
            n1/=10;
        }
        System.out.println(ans+1);
        
    }
}
