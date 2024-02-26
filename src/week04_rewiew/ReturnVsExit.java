package week04_rewiew;

public class ReturnVsExit {

    public static void main(String[] args) {

        System.out.println("Test Started");

        methodA();

        System.out.println("Test Completed");

    }

    public static void methodA(){

        System.out.println("Method A  is being executed");

       // return;

        System.exit(0);    // burada tüm programi bitiriyor cikis en son methodA yazdiriliyor

    }
}
