public class findMaxVowel {
    public static String findMaxVowels(String para) {
        int[] vowelsCount = new int[5];
        String vowels = "AEIOU";
        for (char ch : para.toCharArray()) {
            ch = Character.toUpperCase(ch);
            if (vowels.indexOf(ch) != -1) {
                vowelsCount[vowels.indexOf(ch)]++;
            }
        }
        
        int maxCnt = -1;
        char maxVowel = ' ';
        for (int i = 0; i < 5; i++) {
            if (vowelsCount[i] > maxCnt) {
                maxCnt = vowelsCount[i];
                maxVowel = vowels.charAt(i);
            } else if (vowelsCount[i] == maxCnt && maxVowel > vowels.charAt(i)) {
                maxVowel = vowels.charAt(i);
            }
        }
        if (maxCnt <= 0) {
            return "no vowels found";
        }

        return maxVowel + ":" + maxCnt;
    }
    public static void main(String[] args) {
        String inp = "MY name is sudeep gowda iam from chowdadenahaali kolar";
        System.out.println(findMaxVowels(inp));
    }
}
