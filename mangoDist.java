public class mangoDist {
    public static int nCr(int n, int r) {
        if (r > n) {
            return 0;
        }
        int result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
    
    public static int distributeMangoes(int persons, int mangoes) {
        if (persons == 0) {
            return 0;
        }
        return nCr(mangoes + persons - 1, persons - 1);
    }

    public static void main(String[] args) {
        int n = 1;
        int r = 12;
        System.out.println(distributeMangoes(r, n));
    }
}