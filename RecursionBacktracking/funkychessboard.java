/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionBacktracking;

/**
 *
 * @author Archit
 */
import java.util.*;
public class funkychessboard {
    static int[][] board;
    static int n;
    static int ans;
    static int dp[][];
    static void f(int i, int j,int count){
        if(i>=n || j>=n || i<0 || j<0 || board[i][j]==0) return;
        board[i][j]=0;
        ans = Math.max(ans,count+1);
           f(i-2,j-1,count +1);
           f(i-2,j+1,count +1);
           f(i-1,j-2,count +1);
           f(i-1,j+2,count +1);
           f(i+1,j-2,count +1);
           f(i+1,j+2,count +1);
           f(i+2,j-1,count +1);
           f(i+2,j+1,count +1);
        //dp[i][j]=0;
           board[i][j]=1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        board = new int[n][n];
        int sum =0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j]=sc.nextInt();
                if(board[i][j]==1) sum++;
            }
        }
        f(0,0,0);
        System.out.println(sum - ans);
    }
}
/*
    public static int solve(){
        int[][] dp = new int[n][n];
        dp[0][0]=1;
        int ans = 0;
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(board[i][j]==1 && dp[i][j]==1){
                    if(i-2>=0 && j-1>=0)
                        dp[i-2][j-1]=1;
                    if(i-2>=0 && j+1<n)
                        dp[i-2][j+1]=1;
                    if(i-1>=0 && j-2>=0)
                        dp[i-1][j-2]=1;
                    if(i-1>=0 && j+2<n)
                        dp[i-1][j+2]=1;
                    if(i+1<n && j-2>=0)
                        dp[i+1][j-2]=1;
                    if(i+1<n && j+2<n)
                        dp[i+1][j+2]=1;
                    if(i+2<n && j-1>=0)
                        dp[i+2][j-1]=1;
                    if(i+2<n && j+1<n)
                        dp[i+2][j+1]=1;
                }
            }
        }
        for(int[] b : dp) System.out.println(Arrays.toString(b));
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(board[i][j]==1 && dp[i][j]==0)
                    ans++;
            }
        }
        
        return ans;
    }
    */
