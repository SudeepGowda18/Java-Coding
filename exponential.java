import java.util.Scanner;

public class exponential {
    public static int exponents(int a, int b) {
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number");
        int a = sc.nextInt();
        System.out.println("Enter the exponent number");
        int b = sc.nextInt();
        int result = exponents(a, b);
        System.out.println("you ans is : " + result);
        sc.close();
    }
}
