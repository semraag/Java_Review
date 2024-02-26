package week07_review;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {


        int[] numbers = new int[5]; // index: 0 ~ 4
        // If we know how many elements to store, but do not know what those elements

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        //numbers[5] = 6;

        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------");

        int[] nums = {10, 20, 30, 40, 50}; // index: 0 ~ 4
        // If we know how many elements to store, and also know what those elements

        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("--------------------------");

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }

        System.out.println("--------------------------");

        for (int each : nums) {
            System.out.println(each);
        }



    }
}
