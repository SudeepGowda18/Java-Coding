import java.util.*;

public class Ascndesn {
    static void sort(Integer arr[]) {
        Arrays.sort(arr, 0, n / 2);
        Arrays.sort(arr, n / 2, n, Collections.reverseOrder());
    }

    public static void main(String[] args) {
        Integer[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, 7 };
        sort(arr);
        System.out.println("Modified String is : " + Arrays.toString(arr));
    }
}
