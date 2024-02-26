package week07_review;

public class MaximumAndMinimum {
    public static void main(String[] args) {

        int[] numbers = {-10, 5, 20, -30, -3, 40, -5};

        int max = numbers[0]; // Assumed that the first element is the maximum number
        int min =  numbers[0]; // Assumed that the first element is the minimum number

        for (int each : numbers) { // each element of the array

            if(each > max){ // if the element in the array is greater than the current maximum number
                max = each;
            }

            if(each < min){ // if the element in the array is smaller than the current minimum number
                min = each;
            }

        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
    }
