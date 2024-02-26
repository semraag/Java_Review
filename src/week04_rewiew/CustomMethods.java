package week04_rewiew;

public class CustomMethods {
    public static void main(String[] args) {
         calculate(20.5,'*',15.0);


    }
    public static void calculate(double num1,char operator,double num2){

        double result = 0;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
        }
        System.out.println(result);

    }




}

/*Create a method named calculate that accepts three arguments:
            1. num1 (double)
            2. operator (char)
            3. num2 (double)

        if the operator is +:
                the method should return the addition of the two numbers

        if the operator is -:
                the method should return the subtraction of the two numbers

        if the operator is *:
                the method should return the multiplication of the two numbers

        If the operator is /:
                    then the method should return the division

        for any other operators, the method should return 0 */
