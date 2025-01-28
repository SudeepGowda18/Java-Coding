public class whiteSpace {
    public static String findWhiteDiff(String S1, String S2) {
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < S1.length(); i++) {
            if (S1.charAt(i) == ' ') {
                countA += 1;
            }
        }
        for (int j = 0; j < S2.length(); j++) {
            if (S2.charAt(j) == ' ') {
                countB += 1;
            }
        }
        int diff = Math.abs(countA - countB);
        if (diff % 2 == 0) {
            return "Even " + diff;
        } else {
            return "odd " + diff;
        }
    }
    public static void main(String[] args) {
        String S1 = "He lL O  W ORl D";
        String S2 = "Hello world";
        System.out.println(findWhiteDiff(S1, S2));
    }
}
