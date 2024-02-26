package week03_rewiew.practice_tasks;

public class BMICalculatorIF {

    public static void main(String[] args) {

        double height = 1.85;
        double weight = 110.5;
        double bmi = weight / (height * height);
        String category;
        category = "Underweight";

        System.out.println(" Your Body Mass Index (BMI) " + bmi);

        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
             category = "Normal Weight";
        } else if (bmi < 30) {
            category =" Overweight";
        } else {
            category =" Obesity";
        }
           System.out.println("Category: " + category);

        switch (category) {  // Displays the suggestion for different BMI category
            case "Overweight", "Obesity":
                System.out.println("Suggestion: Stick to your diet");
                break;
          }
    }
}