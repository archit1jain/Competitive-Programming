/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author Archit
 */
import java.util.*;
public class adjacency_list {
    static class Graph{
        int v;
        ArrayList<Integer>[] l;
        Graph(int V){
            v = V;
            l = new ArrayList[v];
        }
        void addedge(int x , int y){
            if(l[x]==null) l[x]= new ArrayList<>();
            l[x].add(y);
            if(l[y]==null) l[y]=new ArrayList<>();
            l[y].add(x);
        }
        
        void addedge(int x , int y,boolean b){
            if(l[x]==null) l[x]= new ArrayList<>();
            l[x].add(y);
            if(b){
            if(l[y]==null) l[y]=new ArrayList<>();
            l[y].add(x);
            }
        }
        void printAll(){
            for(int i = 0;i<v;i++){
                System.out.println(i + " - > "  + l[i]);

            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // int v = sc.nextInt();
        Graph g = new Graph(4);
        g.addedge(0,1);
        g.addedge(0,3);
        g.addedge(0,2);
        g.addedge(2,3);
        g.addedge(1, 3);
        g.printAll();
        
    }
}
