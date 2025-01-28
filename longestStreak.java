public class longestStreak {
    public static int longStreak(int[] A, int n) {
        int currCnt = 0;
        int maxCnt = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == 1) {
                currCnt++;
            } else {
                currCnt = 0;
            }
            maxCnt = Math.max(maxCnt, currCnt);
        }
        return maxCnt;
    }

    public static void main(String[] args) {
        int[] A = { 0, 1, 0, 1, 1, 1, 0 };
        int n = A.length;
        System.out.println(longStreak(A, n));
    }
}
