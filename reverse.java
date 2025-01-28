import java.util.Scanner;

public class reverse {
    public static int reverseNum(int num) {
        int revnum = 0;
        while (num != 0) {
            int lastNum = num % 10;
            revnum = revnum * 10 + lastNum;
            num = num / 10;
        }
        return revnum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverseNum(num));
    }
}
