package week06_review;

public class FinraMethod {
    public static void main(String[] args) {

        Finra(25);


    }
    public static void Finra(int num) {

        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Finra ");
            } else if (i % 5 == 0) {
                System.out.print("Ra ");

            } else if (i % 3 == 0) {
                System.out.print("Fin ");

            } else {
                System.out.print(i + " ");
            }
        }

    }
}