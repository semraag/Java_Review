package week06_review;

public class LoopIfFinra {
    public static void main(String[] args) {

        int num = 60;

        for (int i = 1; i < num ; i++) {
            if (i %3 == 0 && i %5== 0){
                System.out.print("Finra ");
            } else if (i %5==0) {
                System.out.print("Ra ");

            } else if (i %3== 0) {
                System.out.print("Fin ");

            }else {
                System.out.print(i+" ");
            }
        }

    }

}
