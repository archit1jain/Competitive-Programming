import java.util.*;
public class codejam1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j =1;
        for(int tt =0;tt<n;tt++){
            int k = sc.nextInt();
            Set<Character> s = new HashSet<>();
            for(int i =0;i<k;i++) s.add(sc.next().charAt(0));
            if(s.size()>1)
                System.out.println("Case #"+ j + ":" +" IMPOSSIBLE");
            else{
                if(s.contains('R'))System.out.println("Case #"+ j + ": " +'P');
                if(s.contains('P'))System.out.println("Case #"+ j + ": " +'S');
                if(s.contains('S'))System.out.println("Case #"+ j + ": " +'R');
            }
            j++;
        }
    }
}
