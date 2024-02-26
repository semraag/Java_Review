package week07_review;
import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

    /*
        String reverse:
            str = "ABCD";

            reversed = "DCBA"
         */


        String[] names = {"Dina", "Abdeljalil", "Emrah", "Rabee", "Semen", "Fettouma", "Ayat"};

        String[] reversed = new String[names.length];
        // Ensure that the array has enough capacity to store all the elements of the given array

        System.out.println(Arrays.toString(names));

        for (int i = names.length - 1, j = 0; i >= 0; i--, j++) { // i: represents the index numbers of array names. in reversed order
            reversed[j] = names[i];
        }


        System.out.println(Arrays.toString(reversed));


    }
}
