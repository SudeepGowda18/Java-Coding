import java.util.Scanner;

public class octalToDeci {
    public static int OctalToDeci(int n) {
        int decimal = 0;
        int base = 1;
        while (n > 0) {
            int lastDigit = n % 10;
            decimal += lastDigit * base;
            base = base * 8;
            n /= 10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(OctalToDeci(n));
    }
}