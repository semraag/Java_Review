package week06_review;

public class IfMedian {
    public static void main(String[] args) {

        int a = 20,
                b= 15,
                c= 25;
        if ((a > b && b > c)|| (c > b && b > a)){
                System.out.println("median is: " + b);
            } else if((b > a && a > c)||(c > a && a > b)){
                    System.out.println("median is: "+a);
                } else{
                System.out.println("median is: "+ c);
            }



    }
}