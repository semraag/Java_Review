package week07_review;
import java.util.Arrays;
public class multiDimensionelExampleStudents {
    public static void main(String[] args) {

        /*
        String[] group1 = {"Ayat", "Kiara", "Shukria"};

        String[] group2 = {"Maksym", "Samira", "Rabee", "Dmitry", "Semen"};

        String[] group3 = {"Abdeljalil", "Audrone", "Khasan", "Dina"};
         */


        // Arrays:                      0                                    1                                            2
        String[][] groups = { {"Ayat", "Kiara", "Shukria"}, {"Maksym", "Samira", "Rabee", "Dmitry", "Semen"}, {"Abdeljalil", "Audrone"} };
        // Elements:             0        1         2           0          1        2         3        4           0              1

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }

        System.out.println("-------------------------------------");

        for (int i = 0; i < groups.length; i++) { // i: index number of Arrays
            System.out.println( Arrays.toString( groups[i]));
            for (int j = 0; j < groups[i].length; j++) { // J: index number of Elements
                groups[i][j] = groups[i][j].toUpperCase();
            }
        }

        System.out.println(Arrays.deepToString(groups));


    }
}
