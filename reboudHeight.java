public class reboudHeight {
    public static int calcRebound(double H, double V, double Vn, double N) {
        // int rebHeight = 0;
        // Hn = H * e^2*N
        double e = V / Vn;
        double pow = Math.pow(e, 2 * N);
        double Hn = H * pow;
        return (int) Hn;
    }
    public static void main(String[] args) {
        double H = 10;
        double V = 15;
        double Vn = 5;
        double N = 3;
        System.out.println(calcRebound(H, V, Vn, N));
    }
}
