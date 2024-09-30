/*Mohammed Qutu
 * 4/7/24
 * 21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
 */

import java.util.Scanner;

public class SentenceValidatorApp {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a sentence 3 to 50 characters long "
                + "with at least one uppercase, lowercase, and one of these symbols"
                + " (. ! ?):");
        String sentence = keyboard.nextLine();
        if (isValidSentence(sentence)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean isValidSentence(String sentence) {
        if (sentence.length() < 3 || sentence.length() > 50) {
            return false;
        }
        if (!(sentence.contains(".") || sentence.contains("!") || sentence.contains("?"))) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        for (char c : sentence.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
        }
        return hasUpperCase && hasLowerCase;
    }
}
