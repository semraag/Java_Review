package week03_rewiew.practice_tasks;

public class MovieTicketBooking {
    public static void main(String[] args) {

        int age = 23;

        System.out.println("age = " + age);

        if (age >= 0 && age <= 2) {
            System.out.println("Free tickets for infants");
        } else if (age <= 12) {
            System.out.println("The ticket price for your age is  $8");
        } else if (age <= 20) {
            System.out.println("The ticket price for your age is  $8");
        } else if (age < 64) {
            System.out.println("The ticket price for your age is  $12");
        } else {
            System.out.println("The ticket price for your age is  $10");

        }
    }
}
