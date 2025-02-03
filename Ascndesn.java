import java.util.*;

public class Ascndesn {
    static void sort(Integer arr[]) {
        int n = arr.length;
        Arrays.sort(arr, 0, n / 2);
        Arrays.sort(arr, n / 2, n, Collections.reverseOrder());
    }

    public static void main(String[] args) {
        Integer[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, 7 };
        System.out.println("Modified String is : " + Arrays.toString(arr));
    }
}
