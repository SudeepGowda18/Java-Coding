public class bitwise {
    public static int bitWiseOR(int a, int b) {
        return a | b;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int result = bitWiseOR(a, b);
        System.out.println(result);
    }
}