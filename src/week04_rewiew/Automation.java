package week04_rewiew;

public class Automation {
    public static void main(String[] args) {

        String url = "www.google.com";
        String browser = "chrome";

      /*  System.out.println("Opening the "+ browser + " browser..");
        System.out.println("Navigating to "+url);

        System.out.println("Executing the test case 1");

        System.out.println("Getting the test result of the case 1");
        System.out.println("Closing the "+browser+" browser");


       */ //BUNU TAM YEDI KERE TEKRAR ETMEMIZ GEREKIYORDU 7 AYRI BROWSER ICINLOOP UYGULAYARAK KISALTIYORUZ

        for (int i = 1; i < 8 ; i++) {
            System.out.println("--------------30 sounds pause ---------------");

            System.out.println("Navigating to "+url);

            System.out.println("Executing the test case "+i);

            System.out.println("Getting the test result of the case "+i);
            System.out.println("Closing the "+browser+" browser");
        }
    }
}
/*
Create a class named Automation and write a Java program that simulates simple web automation for a given URL.

The program structure should include the following steps for automating 7 test cases:

        1. Open the specified browser
        2. Navigate to the URL

        3. Execute the test case

        4. Get the test result
        5. Close the browser

The program structure should be designed to perform these steps for each of the 7 test cases on the provided URL.


        2. Create a Java class named DivisibleByTwo and write a program that calculates how many times a given number can be divided by 2.

Example:
Input: 40

Output:
        3 times


Explanation:
        40 / 2 ==> 20
        20 / 2 ==> 10
        10 / 2 ==> 5

        In total, it can be divided 3 times.   */
