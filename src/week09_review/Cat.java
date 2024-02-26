package week09_review;

public class Cat extends Animal implements Playable{
    public Cat(String name, int age, String breed, String gender, String color) {
        super(name, age, breed, gender, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps at least 11 hours");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing ...");
    }


}

/*
2.2 Cat Class:
      Attributes:
          name, age, breed, gender, color

      Actions:
        eat(), drink(), sleep(), toString(), play()
}*/
