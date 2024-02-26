package week06_review;

public class ForLoopAlfabet {
    public static void main(String[] args) {

         for (char i = 'A'; i <='E' ; i++) {
            for (char j = 'a'; j <= 'z' ; j++) {
                System.out.print("" + i + j + " ");
            }
            System.out.println();
        }

        // HAVALI YÖNTEM

       /* String result = "";
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                result += i;
                result += j +" ";
            }
            result += "\n";

        }
        System.out.println(result);  */
    }
}