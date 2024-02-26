package week02_rewiew.practice_tasks;

public class EmailGenerator {
    public static void main(String[] args) {

        String  firstName= "Daniel";
        int birtYear = 1985;

        System.out.println("Your generated emails are: ");
        System.out.println("Yahoo: "+firstName+"_"+birtYear+"@yahoo.com");
        System.out.println("Gmail: "+firstName+"_"+birtYear+"@gmail.com");
        System.out.println("Outlook:"+firstName+"_"+birtYear+"@outlook.com");
        System.out.println("-----------------------------------------------------------");

        String  firstNme= "Daniel";
        int birtYar = 1985;
        String  emailPattern= firstName+"."+birtYear;
        String  yahoo= emailPattern+"@yahoo";
        String gmail= emailPattern+"@gmail.com";
        String outlook= emailPattern+"@outlook.com";

        System.out.println("yahoo = " + yahoo);
        System.out.println("gmail = " + gmail);
        System.out.println("outlook = " + outlook);


    }
} /*
Create a class named EmailGenerator.

Given the following variables:
        - firstName
       - birthYear

The program should generate emails for Gmail, Yahoo, and Outlook by combining the firstName with
an underscore and birthYear, followed by the domain of the email.

Example:
firstName = "Daniel"
birthYear = 1985

Output:
Your generated emails are:
Yahoo: Daniel_1985@yahoo.com
Gmail: Daniel_1985@gmail.com
Outlook: Daniel_1985@outlook.com */