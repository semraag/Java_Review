package week09_review;

public class Eagle  extends Animal implements WildAnimal, Flyable{
    public Eagle(String name, int age, String breed, String gender, String color) {
        super(name, age, breed, gender, color);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void hunt() {

    }
}

/*
2.6 Eagle Class:
      Attributes:
          name, age, breed, gender, color

      Actions:
          eat(), drink(), sleep(), toString(), hunt(), fly()
 */

