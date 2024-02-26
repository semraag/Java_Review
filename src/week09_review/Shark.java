package week09_review;

public class Shark extends Animal implements WildAnimal, Swimmable{
    public Shark(String name, int age, String breed, String gender, String color) {
        super(name, age, breed, gender, color);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }


    @Override
    public void swim() {

    }

    @Override
    public void hunt() {

    }
}

/*
 2.8 Shark Class:
      Attributes:
          name, age, breed, gender, color

      Actions:
        eat(), drink(), sleep(), toString(), hunt(), swim()
 */



