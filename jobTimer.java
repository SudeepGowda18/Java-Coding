public class jobTimer {
    public static int findJobs(int N, int X) {
        if (N == 1) {
            return 0;
        }
        int firstThree = (N - 1) * 10;
        int firstThreeTime = (N - 1) * X;
        return Math.max(0, firstThree - firstThreeTime);
    }
    public static void main(String[] args) {
        int N = 4;
        int X = 5;
        System.out.println(findJobs(N, X));
        System.out.println(findJobs(5, 10));
    }
}
