package week06_review;

public class SwitchCalculator {

    public static void main(String[] args) {

        int n1= 100,
                n2 = 200;
        char mathOp= '-';

        switch (mathOp){
            case '-':
                System.out.println("Subtraction: "+(n1-n2));
                break;
            case '+':
                System.out.println("Addition: "+ (n1 +n2));
                break;
            case '*':
                System.out.println("Multiplication: "+(n1*n2));
                break;
            case '/':
                if (n2 == 0){
                    System.out.println("can not divide a number by zero");
                }
                System.out.println("Division: "+(n1/n2));
                break;
            default:
                System.out.println("Invalid math operator");
        }


    }

}

