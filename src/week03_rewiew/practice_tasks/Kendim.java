package week03_rewiew.practice_tasks;

public class Kendim {
    public static void main(String[] args) {

        // Assume that the given weight and height are valid
        double height = 1.85;
        double weight =  125.6;

        // 1.1 Calculate the BMI:
        double bmi = weight / (height * height); //  calculates the Body Mass Index

        System.out.println("Your Body Mass Index (BMI): " + bmi);  // display the body mass index


        // 1.2 Use the calculated BMI to determine the BMI category
        String category;

        if (bmi < 18.5) { // if the bmi is less than 18.5

            category = "Underweight";

        } else if (bmi >= 18.5 && bmi < 25) {  // if the bmi is between 18.5 (included) to 25 (excluded)

            category = "Normal Weight";

        } else if (bmi >= 25 && bmi < 30) { // if the bmi is between 25 (includes) to 30 (excluded)

            category = "Overweight";

        } else { // if the bmi is 30 or greater

            category = "Obesity";

        }

        System.out.println("Category: " + category);  // Display the BMI category


        // 1.3 Give Suggestion to the users that are in Overweight and Obisity category
        switch (category) {
            case "Overweight" , "Obesity":
                System.out.println("Suggestion: Stick to your diet");
                break;

        }



    }


}
