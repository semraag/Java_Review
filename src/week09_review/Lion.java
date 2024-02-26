package week09_review;

public class Lion extends Animal implements WildAnimal {
    public Lion(String name, int age, String breed, String gender, String color) {
        super(name, age, breed, gender, color);
    }

    @Override
    public void eat() {
        hunt();
        System.out.println("The lion " + getName() + " is eating");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void hunt() {

    }

}

/*
2.3 Lion Class:
      Attributes:
          name, age, breed, gender, color

      Actions:
        eat(), drink(), sleep(), toString(), hunt()
 */

