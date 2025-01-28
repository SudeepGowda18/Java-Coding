public class specialFibo {
    public static int specialFibonacci(int n) {
        if (n == 0 || n == 1)
            return 1;
        int f0 = 1;
        int f1 = 1;
        for (int i = 2; i <= n; i++) {
            int f2 = (f1 * f1 + f0 * f0) % 47;
            f0 = f1;
            f1 = f2;
        }
        return f1;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(specialFibonacci(n));
    }
}
