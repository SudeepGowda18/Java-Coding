public class sumEven {
    public static int addEvenSum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8}; 
        int n = arr.length;
        System.out.println(addEvenSum(arr, n));
    }
}
