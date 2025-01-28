import java.util.*;
public class bread {
    public static String findBread(String S) {
        if (S.length() < 2) {
            return "";
        }
        char firstBread = S.charAt(0);
        char lastBread = S.charAt(S.length() - 1);
        if (firstBread == lastBread)
            return String.valueOf(firstBread);

        return String.valueOf(firstBread) + lastBread;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("sandwich is " + findBread(input));

    }
}