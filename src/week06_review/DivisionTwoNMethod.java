package week06_review;

public class DivisionTwoNMethod {
    public static void main(String[] args) {

        String division = Division(45,6);
        System.out.println(division);

    }

    public static String Division(int num1,int num2){

        int counter= 0;

        while (num1 >= num2){

            num1 = num1 -num2;
            counter++;
        }

        return (" counter is = "+counter+" reminder is = "+num1);
    }
}
