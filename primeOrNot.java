import java.util.*;
public class primeOrNot {
    public static String primeOdd(int n) {
        if (n <= 1) {
            return "not prime";
        }
        if (n == 2) {
            return "prime";
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return "not prime";
            }
        }
        return "prime";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(primeOdd(n));
    }
}