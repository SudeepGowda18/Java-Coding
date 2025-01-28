import java.util.Arrays;

public class maxPerLift {
    public static int maxPersons(int n, int w, int[] p) {
        if (n == 0) {
            return 0;
        }
        int cnt = 0;
        int totalWeight = 0;
        Arrays.sort(p);
        for (int i = 0; i < n; i++) {
            if (totalWeight + p[i] <= w) {
                totalWeight += p[i];
                cnt++;
            } else {
                break;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n = 4;
        int w = 10;
        int[] p = { 2, 1, 7, 3 };
        System.out.println(maxPersons(n, w, p));
    }
}
