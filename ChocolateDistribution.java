import java.util.*;

public class ChocolateDistribution {
    public static int minGroup(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - 5; i++) {
            int min = arr[i + 4] - arr[i];
            minDiff = Math.min(min, minDiff);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int[] arr = {10, 4, 12, 3, 1};
        System.out.println(minGroup(arr));
    }
}