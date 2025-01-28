import java.util.*;

public class VowelConsonantFactorial {
    public static void main(String[] args) {
        String input = "example";
        StringBuilder consonants = new StringBuilder();
        long vowelFactorial = 1;

        for (char ch : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                vowelFactorial *= factorial(ch);
            } else {
                consonants.append(ch);
            }
        }

        System.out.println("Consonants: " + consonants);
        System.out.println("Vowel Factorial: " + vowelFactorial);
    }

    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
