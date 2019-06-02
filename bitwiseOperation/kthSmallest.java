/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwiseOperation;

/**
 *
 * @author Archit
 */
import java.util.*;
public class kthSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tt = 0; tt<t ; tt++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i =0;i<n;i++)a[i]=sc.nextInt();
            PriorityQueue pq = new PriorityQueue<>(Collections.reverseOrder());
            int k = sc.nextInt();
            for(int i =0;i<n;i++){
                if(pq.size()<k)pq.add(a[i]);
                else{
                    if(a[i]<(int)pq.peek()){
                        pq.poll();
                        pq.add(a[i]);
                    }
                }
            }
            System.out.println((int)pq.peek());
        }
    }
}
