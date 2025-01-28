public class accentureFact {
    public static long factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        String input = "Sudeepgowdaa";
        StringBuilder consonants = new StringBuilder();
        int consonantsCount = 0;
        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                consonants.append(ch);
                consonantsCount++;
            }
        }
        long fact = factorial(consonantsCount);
        System.out.println(consonants);
        System.out.println(consonantsCount);
        System.out.println(fact);
    }
}