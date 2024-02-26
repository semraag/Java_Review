package week04_rewiew;

public class DivisibleByTwo {
    public static void main(String[] args) {

        int number = 40;

        int count = 0; //  kac kez bölünebilecek.baslangicta 0

        // 2 ye bölünebildigi sürece döngü devam edecek bu yüzden WHILE kullaniyoruz,kac kereyi bilmedigimiz icin

        while (number %2 == 0){
            //  number = number /2 ama javada  seklinde yazilir   number /= 2
            number /= 2 ;
            count++;
        }
        System.out.println(count +" times");

    }

}

/*Create a Java class named DivisibleByTwo and write a program that calculates how many times a given number can be divided by 2.

        Example:
                Input: 40

        Output:
                3 times
 Explanation:
            40 / 2 ==> 20
            20 / 2 ==> 10
            10 / 2 ==> 5

            In total, it can be divided 3 times.*/
