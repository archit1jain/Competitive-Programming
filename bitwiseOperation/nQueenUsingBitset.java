package bitwiseOperation;
import java.util.*;
/**
 *
 * @author Archit
 */
public class nQueenUsingBitset {
    static int[] col,d1,d2;
    public static int solve(int r,int n,int ans){
        if(r==n) {return ans+1;}
        for(int c = 0;c<n;c++){
                if(col[c]!=1 && d1[n-1+r-c]!=1 && d2[r+c]!=1){
                    col[c]=d1[n-1+r-c]=d2[r+c]=1;
                    ans= solve(r+1,n,ans);
                    col[c]=d1[n-1+r-c]=d2[r+c]=0;
                }
        } 
        return ans;
    }
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      col = new int[n];
      d1 = new int[2*n-1];
      d2 = new int[2*n-1];
      System.out.println(solve(0,n,0));
  }  
}