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
public class activityselection {
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
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<act> l = new ArrayList<>();
            for(int i = 0;i<n;i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                l.add(new act(x,y));
            }
            //System.out.println(l);
            Collections.sort(l,new compare());
            //System.out.println(l);
            int count = 0;
            int fin = 0;
            for(int i = 0;i<n;i++){
                if(l.get(i).start>=fin){
                    count++;
                    fin=l.get(i).finish;
                }
            }
            System.out.println(count);
            
        }
    }
}
