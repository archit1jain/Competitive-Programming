package Basic;

    import java.math.BigInteger;
    import java.util.*;
    public class subArraywithDistict {
        static long mod = 1000000007;
        public static BigInteger count(BigInteger n){
            n = n.multiply(n.add(BigInteger.ONE));
            return n.divide(BigInteger.valueOf(2));
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            BigInteger sum=BigInteger.ZERO;
            int[] a = new int[n];
            for(int i =0;i<n;i++)a[i]=sc.nextInt();
            Set<Integer> s = new HashSet<>();
            int j =0;
            for(int i =0;i<n;i++){
                while(j<n && !s.contains(a[j])){
                    s.add(a[j]);
                    j++;
                }
                sum = sum.add(count(BigInteger.valueOf(j-i)));
                s.remove(a[i]);
            }
            System.out.println(sum.mod(BigInteger.valueOf(mod)));
        }
    }
