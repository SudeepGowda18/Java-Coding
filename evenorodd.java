import java.lang.reflect.Array;

public class evenorodd {
    public static void EvenorOdd(int[] arr, int length) {
        String ans = " ";
        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 == 0) {
                ans += "even ";
            } else {
                ans += "odd ";
            }
        }
        System.out.println(ans);
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int length = arr.length;
        EvenorOdd(arr,length);
    }
}
