public class xorsum {
    public static int calculateDifference(int N, int[] A) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                evenSum ^= A[i];
            } else {
                oddSum += A[i];
            }
        }
        return oddSum - evenSum;
    }

    public static void main(String[] args) {
        int[] A = {10, 5, 6, 3, 7, 2};
        int N = 6;
        System.out.println(calculateDifference(N, A));
    }
}
