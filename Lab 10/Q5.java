import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String inputString = reader.readLine();

        
        int vowelCount = 0;
        int numberCount = 0;
        int specialCharCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    vowelCount++;
                }
            } else if (Character.isDigit(c)) {
                numberCount++;
            } else {
                specialCharCount++;
            }
        }

        
        String[] words = inputString.split("\\s+");
        int wordCount = words.length;

        
        boolean isPalindrome = true;
        for (int i = 0, j = inputString.length() - 1; i < j; i++, j--) {
            if (inputString.charAt(i) != inputString.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Number count: " + numberCount);
        System.out.println("Special character count: " + specialCharCount);
        System.out.println("Word count: " + wordCount);
        if (isPalindrome) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}