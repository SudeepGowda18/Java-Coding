public class timeFormat {
    public static int findTime(int x, int y) {
        int product = x * y;
        int result = product % 12;
        if (result == 0) {
            return 12;
        } else {
            return result;
        }
    }
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        System.out.println(findTime(x, y));
    }
}
