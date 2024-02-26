package week04_rewiew;

public class CustomMethodsReturn {
    public static void main(String[] args) {

        int sum =calculate(100, '+', 200);
        System.out.println(sum);
        System.out.println(sum * 100);

        double r = calculate(2.5,'*',3.5);
        System.out.println(r);


    }

    public static int calculate(int num1, char operator, int num2) {
        int result = 0;


        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
        }

        return result;
    }

    public static double calculate(double num1, char operator, double num2) {
        double result = 0;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
        }

        return result;
    }
}