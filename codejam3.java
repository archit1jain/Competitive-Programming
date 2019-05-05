import java.util.*;
/**
 *
 * @author Archit
 */
public class codejam3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l =0;
        for(int i =0;i<n;i++){
            l++;
            int r = sc.nextInt();
            int c = sc.nextInt();
            sc.nextLine();
            int[] r1 = new int[r];
            int[] c1 = new int[c];
            String[] s = new String[r];
            for(int j=0;j<r;j++){
                s[j] = sc.nextLine().trim();
                for(int k =0;k<c;k++){
                    if(s[j].charAt(k)=='#'){
                        r1[j]=1;c1[k]=1;
                    }
                }
            }
            int sum =0;
            for(int j =0;j<r;j++){
                for(int k =0;k<c;k++){
                    if(s[j].charAt(k)=='.'){
                        if(r1[j]==0)sum++;
                        if(c1[j]==0)sum++;
                    }
                }
            }
            System.out.println("Case #"+l+": "+sum);
            
        }
    }
}
