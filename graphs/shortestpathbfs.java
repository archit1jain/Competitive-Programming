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
class shortestpathbfs{
    static class Graph{
        HashMap<Integer,ArrayList<Integer>> map;
        //int V;
        Graph(){
            map = new HashMap<>();
            //V = v;
        }
        void addedge(int u, int v){
            if(!map.containsKey(u)) map.put(u, new ArrayList<>());
            map.get(u).add(v);
            if(!map.containsKey(v)) map.put(v, new ArrayList<>());
            map.get(v).add(u);
        }
        
        void addedge(int u, int v,boolean b){
            if(!map.containsKey(u)) map.put(u, new ArrayList<>());
            map.get(u).add(v);
            if(b){
                if(!map.containsKey(v)) map.put(v, new ArrayList<>());
                map.get(v).add(u);
            }
        }
        void bfs(int s,int d){
            Queue<Integer> q = new LinkedList<>();
           HashSet<Integer> visited = new HashSet<>();
            q.add(s);
            int[] dist = new int[map.size()];
            Arrays.fill(dist,Integer.MAX_VALUE-10);
            dist[0]=0;
            int[] parent = new int[map.size()];
            parent[0]=-1;
            visited.add(s);
            while(!q.isEmpty()){
                int curr = q.remove();
                System.out.println(curr);
                //visited.add(curr);
                map.get(curr).stream().forEach((node) -> {
                    if(!visited.contains(node)){
                    q.add(node);
                    visited.add(node);
                    dist[node] = Math.min(dist[node],1+dist[curr]);
                    parent[node]=curr;
                    }
                });
            }
            System.out.println(Arrays.toString(parent));
            int temp = d;
            while(temp!=-1){
                System.out.print(temp + " ");
                temp = parent[temp];
            }
        }
        
    }
    public static void main(String[] args){
        Graph g = new Graph();
        g.addedge(0,1);
        g.addedge(1,2);
        g.addedge(0,4);
        g.addedge(2, 4);
        g.addedge(2,3);
        g.addedge(3,4);
        g.addedge(3,5);
        g.bfs(0,5);
    }
}
