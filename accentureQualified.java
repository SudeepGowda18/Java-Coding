import java.util.Arrays;

public class accentureQualified {
    public static String calcELigible(int n, int p, int[] s1, int[] s2) {
        int[] differences = new int[n];
        for (int i = 0; i < n; i++) {
            differences[i] = s2[i] - s1[i];
        }
        Arrays.sort(differences);
        int qualiScore = 0;
        for (int i = n - 1; i >= n - p; i--) {
            qualiScore += differences[i];
        }
        if (qualiScore >= 35) {
            return "qualfied " + qualiScore;
        } else {
            return "disqualified " + qualiScore;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int p = 3;
        int[] S1 = {30, 20, 15, 20, 25};
        int[] S2 = {25, 30, 20, 30, 25};
        System.out.println(calcELigible(n, p, S1, S2));
    }
}