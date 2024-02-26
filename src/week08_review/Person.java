package week08_review;

public class Person {
    private String name;
    private int age;
    private char gender;

    public final static boolean isHuman, canBreath;
    public final static int numberOfHeads;

    static {
        isHuman = true;
        canBreath = true;
        numberOfHeads = 1;
    }

    /*
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender){
        this(name, gender);
        this.age = age;
    }
*/

    public Person(String name, int age, char gender) {
        setName(name); // this.name = name;
        setAge(age); // this.age = age;
        setGender(gender);// this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            /*
            System.err.println("Name of the person can not be set to null");
            System.exit(1);
             */
            throw new RuntimeException("Name of the person can not be set to null");
        }

        if (name.isEmpty() || name.isBlank()) {
            /*
            System.err.println("Name of the person can not be set to empty  or blank");
            System.exit(1);
             */

            throw new RuntimeException("Name of the person can not be set to empty  or blank");

        }

        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            /*
            System.err.println("Age can not be set to negative or zero");
            System.exit(1);
             */
            throw new RuntimeException("Age can not be set to negative or zero");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (("" + gender).equalsIgnoreCase("f") || ("" + gender).equalsIgnoreCase("m")) {
            this.gender = gender;
        } else {
            /*
            System.err.println("Gender can only be set to 'M' or 'F'");
            System.exit(1);
             */
            throw new RuntimeException("Gender can only be set to 'M' or 'F'");
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}

/*
1. Create a class named Person with the following specifications:
     Attributes:
       - name (String)
       - age (int)
       - gender (char)

     Encapsulate all the fields.
     Add a constructor that can set all the fields when the Person class is created.

     Actions:
       - toString()
}*/
