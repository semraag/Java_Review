package week09_review;

public abstract class Animal {
    private String name;
    private int age;
    private final String breed,gender,color;
    public Animal(String name, int age, String breed, String gender, String color) {

        if( !(gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male")) ){
            throw new InvalidGenderException("Gender of the animal can only be male or female");
        }

        setName(name);
        setAge(age);
        this.breed = breed;
        this.gender = gender;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {

        if(name == null || name.isEmpty()){
            throw new InvalidNameException("Name of the animal can not be set to null or empty");
        }

        this.name = name;
    }

    public void setAge(int age) {

        if(age <= 0){
            throw new InvalidAgeException("Age of the animal can not be set to zero or negative");
        }

        this.age = age;
    }


    public abstract void eat();

    public final void drink(){
        System.out.println(name + " is drinking water");
    }

    public abstract void sleep();


    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}

/*
1. Create a class named 'Animal' with the following specifications:
   Attributes:
     - name: String
     - age: int
     - breed: String (final)
     - gender: String (final)
     - color: String (final)

  Encapsulate all the fields:
          Conditions:
              The name attribute cannot be set to null or empty. If this condition is violated, throw an InvalidNameException

              The age attribute cannot be set to zero or negative. If this condition is violated, throw an InvalidAgeException.

              The gender attribute can only be set to 'male' or 'female'. If this condition is violated, throw an InvalidGenderException.


   Add a constructor that sets all fields when an Animal object is instantiated.

   Actions:
     - eat()
     - drink()
     - sleep()
     - toString()
 */

