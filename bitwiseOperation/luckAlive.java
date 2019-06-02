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
class Node{
    Node next;
    int data;
    Node(int i){
        data = i;
    }
}
public class luckAlive {
    static int count;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tt = 0;tt<t;tt++){
            int n = sc.nextInt();
            count=n;
            Node head = new Node(1);
            Node curr = head;
            for(int i =2;i<=n;i++){
                Node n1 = new Node(i);
                curr.next=n1;
                curr=n1;
            }
            curr.next=head;
            curr = head;
            while(count!=1){
                curr.next=curr.next.next;
                curr = curr.next;
                count--;
            }
            System.out.println(curr.data);
        }
    }
}
