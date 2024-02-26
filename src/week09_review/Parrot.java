package week09_review;

public class Parrot extends Animal implements Playable, Flyable{
    public Parrot(String name, int age, String breed, String gender, String color) {
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
    public void play() {

    }

}

/*
  2.5 Parrot Class:
       Attributes:
          name, age, breed, gender, color

      Actions:
          eat(), drink(), sleep(), toString(), play(), fly()
 */

