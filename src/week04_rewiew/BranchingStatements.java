package week04_rewiew;

public class BranchingStatements {

    public static void main(String[] args) {

        String url = "www.google.com";
        String browser = "chrome";


        for (int i = 1; i < 8; i++) {

         /*   if (i == 3 || i== 6){  // eger 3. ve 6. döngüyü atlamak istiyorsak
                continue;  //  jamp to the next iteration.sonraki tekrara atlar.Yani 4 sonra 5 7
            }
            */


            if (i == 5){
              //  break; // Loob un icinde bundan sonrasini yazdirmiyor

              //  return;  // Loob un disindakilerde dahil hicbir seyi görmeyip basa dönüyor
            }

            System.out.println("--------------30 sounds pause ---------------");
            System.out.println("Navigating to " + url);

            System.out.println("Executing the test case " + i);

            System.out.println("Getting the test result of the case " + i);
            System.out.println("Closing the " + browser + " browser");
        }
        System.out.println("SONNNNNN");
    }
}
