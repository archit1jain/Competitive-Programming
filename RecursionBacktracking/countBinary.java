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
public class countBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[][] dp = new long[91][2];
        dp[1][0]=dp[1][1]=1;
        for(int i =2;i<91;i++){
            dp[i][0]=dp[i-1][0]+dp[i-1][1];
            dp[i][1]=dp[i-1][0];
        }
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            System.out.println("#"+(i+1)+" : "+(dp[n][1]+dp[n][0]));
        }
    }
}
/*3416454622906707
61305790721611591
75025
591286729879
24157817
23416728348467685
196418
63245986
44945570212853
3416454622906707
1134903170
317811
317811
46368
3524578
514229
308061521170129
165580141
17711
196418
75025
956722026041
63245986
956722026041
433494437
308061521170129
956722026041
102334155
5702887
5527939700884757
165580141
44945570212853
1304969544928657
20365011074
61305790721611591
3524578
117669030460994
8944394323791464
12586269025
365435296162
365435296162
63245986
121393
225851433717
10610209857723
6557470319842
8944394323791464
225851433717
225851433717
165580141
10610209857723
27777890035288
9227465
3524578
32951280099
2111485077978050
3416454622906707
27777890035288
72723460248141
1304969544928657
1836311903
3416454622906707
1134903170
10610209857723
1548008755920
2971215073
14472334024676221
956722026041
806515533049393
591286729879
498454011879264
2971215073
365435296162
86267571272
514229
832040
46368
498454011879264
8944394323791464
1548008755920
832040
72723460248141
23416728348467685
5527939700884757
514229
14472334024676221
1134903170
53316291173
956722026041
514229
2178309
956722026041
956722026041
498454011879264
4052739537881
1548008755920
165580141
7778742049
10610209857723
832040
*/