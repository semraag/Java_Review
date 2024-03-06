package week11_review.array_review;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] inputArray = {10, 0, 5, 0, 1, 0};
        int length = inputArray.length;
        int[] outputArray = new int[length];
        int count = 0;

        for(int i = 0; i < length; i++) {
            if (inputArray[i] != 0) {
                outputArray[count] = inputArray[i];
                count++;
            }
        }

        for (int i = count; i < length; i++) {
            outputArray[i] = 0;
        }

        System.out.println(Arrays.toString(outputArray));
    }
    }

