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
public class adjacencyliststring {
 static class Graph<T>{
     HashMap<T,ArrayList<T>> map;
     Graph(){
         map = new HashMap<>();
     }
     void addedge(T u, T v){
         if(map.containsKey(u))map.get(u).add(v);
         else{
             map.put(u,new ArrayList<>());
             map.get(u).add(v);
         }
         if(map.containsKey(v))map.get(v).add(u);
            else{
             map.put(v,new ArrayList<>());
             map.get(v).add(u);
         }
     }
     void addedge(T u, T v,boolean b){
         if(map.containsKey(u))map.get(u).add(v);
         else{
             map.put(u,new ArrayList<>());
             map.get(u).add(v);
         }
         if(b){
             if(map.containsKey(v))map.get(v).add(u);
            else{
             map.put(v,new ArrayList<>());
             map.get(v).add(u);
         }
         }
     }
     void printAll(){
         for(T key : map.keySet()){
             System.out.println(key + " ->  " + map.get(key));
         }
     }
    }
    public static void main(String[] args){
        Graph<String> g = new Graph<>();
        g.addedge("Amrisar", "Delhi");
        g.addedge("Delhi", "Banglore");
        g.addedge("Delhi", "Agra");
        g.addedge("Amritsar", "Jaipur");
        g.addedge("Japur", "Banglore");
        g.printAll();
    }
}
