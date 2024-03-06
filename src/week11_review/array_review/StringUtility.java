package week11_review.array_review;

/**
 * This class provides utility methods for working with Strings.
 */
public class StringUtility {

    /**
     * Reverses the order of the characters in a String and returns the result.
     *
     * @param str the String to reverse
     * @return the reversed String
     */
    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    /**
     * Prints each character in a String to the console.
     *
     * @param str the String to print
     */
    public static void printEachCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    /**
     * Returns a String containing all unique characters in a String, in order.
     *
     * @param str the String to analyze
     * @return a String containing all unique characters in the input String, in order
     */
    public static String displayUniqueCharacters(String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                // if the first time the character has occurred in the string is also the last time it occurred, then the character is unique
                unique += ch;
            }
        }
        System.out.println(unique);
        return unique;
    }

    /**
     * Removes all duplicate characters from a String and returns the result.
     *
     * @param str the String to process
     * @return the processed String
     */
    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains(""+each)) {
                result += each;
            }
        }
        return result;
    }

    /**
     * Returns a String containing the frequency of each character in a String, in the format "character: frequency".
     *
     * @param str the String to analyze
     * @return a String containing the frequency of each character in the input String, in the format "character: frequency"
     */
    public static String displayFrequencyOfEachCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            System.out.println(ch + ": " + count);
        }
        return "";
    }
}
