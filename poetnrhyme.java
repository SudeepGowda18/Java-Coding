public class poetnrhyme {
    public static String findBestRhyme(String S, String[] D, int length) {
        int maxMatchLength = 0;
        String bestRhyme = "no word";
        for (int i = 0; i < length; i++) {
            String word = D[i];
            if (S.equals(word))
                continue;
            int matchLength = 0;
            int sIndex = S.length() - 1;
            int wordIndex = word.length() - 1;
            if (sIndex >= 0 && wordIndex >= 0 && S.charAt(sIndex) == word.charAt(wordIndex)) {
                matchLength++;
                sIndex--;
                wordIndex--;
            }
            if (matchLength > maxMatchLength) {
                maxMatchLength = matchLength;
                bestRhyme = word;
            }
        }
        return bestRhyme;
    }
    public static void main(String[] args) {
        String S = "sudeep";
        String[] D = {"pradeep","sandeep","vishnu","sudeep"};
        int length = 4;
        System.out.println(findBestRhyme(S, D, length));
    }
}
