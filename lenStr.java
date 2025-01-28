import java.util.*;
public class lenStr {
    public static int maxCount(String str) {
        int cnt = 0;
        for (char ch : str.toCharArray()) {
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        System.out.println(maxCount(str));
    }
}
