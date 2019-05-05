package Basic;

import java.util.*;
public class hostelVisit2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int tt=0;tt<t;tt++){
            int n = sc.nextInt();
            if(n==1){
                long x = sc.nextLong();
                long y = sc.nextLong();
                long d = x*x+y*y;
                if(pq.size()<k){
                    pq.add(d);
                }
                else{
                    if(d<pq.peek()){
                        pq.poll();
                        pq.add(d);
                    }
                }
            }
            else if(n==2){
                System.out.println(pq.peek());
            }
        }
    }
}