package Basic;

import java.util.*;
public class stringWindow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String s1 = sc.nextLine().trim();
        int l = s.length();
        int l1= s1.length();
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i =0;i<l1;i++){
            if(map.containsKey(s1.charAt(i)))map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            else map.put(s1.charAt(i), 1);
        }
        int j=0;
        map2.putAll(map);
        String s2 = "",s3="";
        boolean flag = false;
        while(j<l && s.charAt(j)!=s1.charAt(0)){
                j++;
        }
        while(j<l){
            if(map2.containsKey(s.charAt(j))){
                 if(map2.get(s.charAt(j))==1) map2.remove(s.charAt(j));
                 else map2.put(s.charAt(j),map2.get(s.charAt(j))-1);
             }
             s2+=String.valueOf(s.charAt(j));
             if(map2.isEmpty()){
                 if(!flag)s3=s2;
                 else{
                     if(s3.length()>s2.length())s3=s2;
                 }
                 flag=true;
                 s2="";
                 while(j+1<l && s.charAt(j+1)!=s1.charAt(0)){
                 j++;
                }
                 map2.putAll(map);
              }
             j++;
        }
        if(flag)System.out.println(s3);
        else System.out.println("No string");
    }
}
