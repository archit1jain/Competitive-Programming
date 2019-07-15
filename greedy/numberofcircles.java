/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy;

/**
 *
 * @author Archit
 */
import java.util.*;
public class numberofcircles {
    static class act{
        int start;
        int finish;
        act(int s, int f){
           start = s;
           finish = f;
        }
    }
    static class compare implements Comparator<act> {
        @Override
        public int compare(act a, act b){
            return a.finish-b.finish;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<act> l = new ArrayList<>();
            for(int i = 0;i<n;i++){
                int c = sc.nextInt();
                int r = sc.nextInt();
                l.add(new act(c-r,c+r));
            }
            //System.out.println(l);
            Collections.sort(l,new compare());
            //System.out.println(l);
            int count = 1;
            int fin = l.get(0).finish;
            for(int i = 1;i<n;i++){
                if(l.get(i).start>=fin){
                    count++;
                    fin=l.get(i).finish;
                }
            }
            System.out.println(n-count);
            
        }
    }
}
