package bitwiseOperation;
import java.util.*;
/**
 *
 * @author Archit
 */
public class nQueenAdvanced {
     static int n;
     static int ans,DONE;
     static int board[][];  
  public static int getposition(int b){
      int i =0;
      while(b>0){
          b>>=1;
          i++;
      }
      return i-1;
  }
  public static void solve(int rowMask,int ld, int rd,int row){
      if(rowMask==DONE){ans++;
      return;}
      int safe = DONE & (~(rowMask|ld|rd));
      while(safe!=0){
          int p = (safe & (-safe));
          int col = getposition(p);
          board[row][col]=1;
          safe = safe - p;
          solve(rowMask|p,(ld|p)<<1,(rd|p)>>1,row+1);
          board[row][col]=0;
      }
  }
    
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      ans =0;
      board = new int[100][100];
      DONE = (1<<n) -1;
      solve(0,0,0,0);
      System.out.println(ans);
  }  
}
