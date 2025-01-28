public class alicenbob {
    public static int longestUninterruptedSubstring(String S) {
        
        String[] substrings = S.split("\\.");  
        int maxLength = 0;
        for (String substring : substrings) {
            if (substring.length() > maxLength) {
                maxLength = substring.length();
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String S = "this.is.a.noobsudeep";
        int output = longestUninterruptedSubstring(S);
        System.out.println(output);  
    }
}