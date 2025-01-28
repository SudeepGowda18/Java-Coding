import java.util.*;

public class uniqueSet {
    public static int uniqueLabel(String A, String B) {
        HashSet<Character> uniqueLabels = new HashSet<>();
        for (char c : A.toCharArray()) {
            uniqueLabels.add(c);
        }
        for (char c : B.toCharArray()) {
            uniqueLabels.add(c);
        }
        return uniqueLabels.size();
    }
    public static void main(String[] args) {
        String A = "aabc";
        String B = "xyyyyzkz";
        System.out.println(uniqueLabel(A, B));
    }
}
