/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
/*
package bitwiseOperation;
import java.io.*;
import java.util.*;
import java.math.*;
public class ultraFastMath {
    public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
                sc.nextLine();
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		for(int i =0;i<t;i++){
                        StringTokenizer st = new StringTokenizer(br.readLine()); 
			String[] s = new String[2];
                        s[0] = st.nextToken().trim();
                        s[1] =st.nextToken().trim();
                        for(int j =0;j<s[0].length();j++){
                           int d1 = Integer.parseInt(s[0].substring(j,j+1));
                           int d2 = Integer.parseInt(s[1].substring(j,j+1));
                           System.out.print(d1^d2);
                        }
		}
    }
}

*/

import java.io.*;
import java.util.*;
import java.math.*;
public class ultraFastMath {
    public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()); 
		for(int i =0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()); 
			String[] s = new String[2];
                        s[0] = st.nextToken().trim();
                        s[1] =st.nextToken().trim();
                        for(int j =0;j<Math.min(s[0].length(),s[1].length());j++){
                           int d1 = Integer.parseInt(s[0].substring(j,j+1));
                           int d2 = Integer.parseInt(s[1].substring(j,j+1));
                           System.out.print(d1^d2);
                        }
                        System.out.println();
		}
    }
}
