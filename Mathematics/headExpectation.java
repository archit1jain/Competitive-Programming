import java.util.*;
public class headExpectation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1<<(n+1);
        ans-=2;
        System.out.println(ans);
    }
}