package Mathematics;
import java.util.*;
import java.math.*;
public class SEQspoj {
    public static BigInteger[][] fill(BigInteger[][] b1,int n){
        for(int i =0;i<b1.length;i++)
            for(int j =0;j<b1[0].length;j++){
                b1[i][j]=BigInteger.valueOf(n);
            }
        return b1;
    }
    static long mod = 1000000000;
    public static BigInteger[][] pow(BigInteger[][] b1,BigInteger n,int k){
        if(n.compareTo(BigInteger.ZERO)<=0){
            BigInteger[][] b3 = new BigInteger[k][k];b3=fill(b3,0);
            for(int i =0;i<k;i++)
                    b3[i][i] = BigInteger.ONE;
            return b3;
        }
        BigInteger[][] ans = pow(b1,n.divide(BigInteger.valueOf(2)),k);
        ans = mulmatr(ans,ans,k,k,k,k);
        if(n.mod(BigInteger.valueOf(2))==BigInteger.ZERO) return ans;
        else return mulmatr(b1,ans,k,k,k,k);
    }
    
    public static BigInteger[][] mulmatr(BigInteger[][] b1 ,BigInteger[][] b2, int b1r,int b1c, int b2r, int b2c ){
        BigInteger[][] ans = new BigInteger[b1r][b2c];
        ans = fill(ans,0);
        for(int i =0;i<b1r;i++){
            for(int j = 0;j<b2c;j++){
                for(int k =0;k<b1c;k++){
                    ans[i][j] = (ans[i][j].add((b1[i][k].multiply(b2[k][j])).mod(BigInteger.valueOf(mod)))).mod(BigInteger.valueOf(mod));
                }
            }
        }
        return ans;
    }
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int tt =0;tt<t;tt++){
          int k = sc.nextInt();
          BigInteger[][] b1 = new BigInteger[k][1];
          for(int i =0;i<k;i++)b1[i][0] = sc.nextBigInteger();
          BigInteger[][] trans = new BigInteger[k][k];
          trans = fill(trans,0);
          for(int i =0;i<k-1;i++){
                  trans[i][i+1]=BigInteger.ONE;
          }
          for(int i =k-1;i>=0;i--)trans[k-1][i]=sc.nextBigInteger();
          BigInteger n = sc.nextBigInteger();
          BigInteger[][] ans = mulmatr(pow(trans,n.subtract(BigInteger.ONE),k),b1,k,k,k,1);
          System.out.println(ans[0][0].mod(BigInteger.valueOf(mod)));
      
      }
      
  } 
}
