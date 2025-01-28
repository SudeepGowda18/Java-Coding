public class breakCount {
    public static int minRemoval(String S) {
        int removeCount = 0;
        int conseP = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'p') {
                conseP++;
                if (conseP == 3) {
                    removeCount++;
                    conseP--;
                }
            } 
                else {
                    conseP = 0;
                }
            }
        return removeCount;
    }
    public static void main(String[] args) {
        String S = "apbpppqp";
        System.out.println(minRemoval(S));
    }
}
