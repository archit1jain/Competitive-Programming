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
public class dfs {
    static class Graph<T>{
        HashMap<T,ArrayList<T>> map;
        //int V;
        Graph(){
            map = new HashMap<>();
            //V = v;
        }
        void addedge(T u, T v){
            if(!map.containsKey(u)) map.put(u, new ArrayList<>());
            map.get(u).add(v);
            if(!map.containsKey(v)) map.put(v, new ArrayList<>());
            map.get(v).add(u);
        }
        
        void addedge(T u, T v,boolean b){
            if(!map.containsKey(u)) map.put(u, new ArrayList<>());
            map.get(u).add(v);
            if(b){
                if(!map.containsKey(v)) map.put(v, new ArrayList<>());
                map.get(v).add(u);
            }
        }
        void dfs(T s){
            Stack<T> q = new Stack<>();
           HashSet<T> visited = new HashSet<>();
            q.add(s);
            while(!q.isEmpty()){
                T curr = q.pop();
                if(!visited.contains(curr)){
                System.out.println(curr);
                visited.add(curr);
                map.get(curr).stream().forEach((node) -> {
                    if(!visited.contains(node));
                    q.add(node);
                });
                }
            }
        }
    }
    public static void main(String[] args){
        Graph<Integer> g = new Graph();
        g.addedge(0,1);
        g.addedge(1,2);
        g.addedge(0,4);
        g.addedge(2, 4);
        g.addedge(2,3);
        g.addedge(3,4);
        g.addedge(3,5);
        g.dfs(1);
    }
}
