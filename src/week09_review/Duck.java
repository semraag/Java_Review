package week09_review;

public class Duck extends Animal implements Flyable, Playable, Swimmable{
    public Duck(String name, int age, String breed, String gender, String color) {
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

    @Override
    public void swim() {

    }
}

/*
2.8 Duck Class:
      Attributes:
          name, age, breed, gender, color

      Actions:
        eat(), drink(), sleep(), toString(), fly(), play(), swim()
 */

