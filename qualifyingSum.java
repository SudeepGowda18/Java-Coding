import java.util.Arrays;

public class qualifyingSum {
    public static String calcELigible(int N, int P, int[] S1, int[] S2) {
        int[] differences = new int[N];
        for (int i = 0; i < N; i++) {
            differences[i] = S2[i] - S1[i];
        }
        Arrays.sort(differences);
        int qualiScore = 0;
        for (int i = N - 1; i >= N - P;i--) {
            qualiScore += differences[i];
        }
        if (qualiScore >= 35) {
            return "qualified " + qualiScore;
        } else {
            return "disqualified " + qualiScore;
        }
    }
    public static void main(String[] args) {
        int N = 5;
        int P = 3;
        int[] S1 = {30, 20, 15, 20, 25};
        int[] S2 = {25, 30, 20, 30, 25};
        System.out.println(calcELigible(N, P, S1, S2));
    }
}
