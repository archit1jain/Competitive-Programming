package Basic;

import java.util.*;
public class hostelVisit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = sc.nextInt();
        List<Long> l = new ArrayList<>();
        long ans = Long.MAX_VALUE;
        for(int tt=0;tt<t;tt++){
            int n = sc.nextInt();
            
            if(n==1){
                long x = sc.nextLong();
                long y = sc.nextLong();
                long d = x*x+y*y;
                boolean flag = true;
                for(int i =0;i<l.size();i++){
                    if(d>ans) break;
                    if( l.get(i)>d){l.add(i,d);
                            flag = false;
                             break;
                    }
                    else if(l.get(i)==d){
                        flag = false;
                        break;
                    }
                }
                if(flag)l.add(d);
            }
            else if(n==2){
                System.out.println(l.get(k-1));
                ans = l.get(k-1);
            }
        }
    }
}