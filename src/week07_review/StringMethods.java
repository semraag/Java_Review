package week07_review;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Wooden Spoon123!";

        String digits = "",
                letters = "",
                specialCharacters = "";


        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                digits += each;
            } else if (Character.isLetter(each)) {
                letters += each;
            } else {
                specialCharacters += each;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialCharacters = " + specialCharacters);

        /*
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

        }
         */


    }
} 