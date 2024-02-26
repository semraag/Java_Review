package week08_review;
import java.util.Arrays;
public class Developer extends Employee{ // Developer Is An Employee
    private String programmingLanguage;

    public Developer(String name, int age, char gender, String employeeId, double salary, String programmingLanguage) {
        super(name, age, gender, employeeId, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        String[] languages = {"Java", "Python", "C#", "Ruby", "C++", "Swift", "JavaScript"};

        boolean isValidProgramminglanguage = false;

        for (String each : languages) {
            if(each.equalsIgnoreCase(programmingLanguage)){
                isValidProgramminglanguage = true;
                break;
            }
        }

        if(isValidProgramminglanguage) {
            this.programmingLanguage = programmingLanguage;
        }else{
            /*
            System.err.println("Invalid programming language name: " +programmingLanguage
                    + "\n valid programming languages are: " + Arrays.toString(languages));
            System.exit(1);
            */

            throw new RuntimeException("Invalid programming language name: " +programmingLanguage
                    + "\n valid programming languages are: " + Arrays.toString(languages));

        }

    }

    public void work(){
        System.out.println(getName() + " is coding");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }


}

/*
3. Create a subclass of Employee named Developer with the following specifications:
     Attributes:
       - programmingLanguage;

     Encapsulate the fields.
     Add a constructor that can set all the fields when the Developer object is created.
     Override the work and displayInfo methods.

 */

