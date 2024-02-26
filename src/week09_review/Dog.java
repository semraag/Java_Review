package week09_review;

public class Dog extends  Animal implements Playable {
    public Dog(String name, int age, String breed, String gender, String color) {
        super(name, age, breed, gender, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps at least 7 hours");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with tennis ball");
    }

    public void bark(){
        System.out.println(getName() + " is barking");
    }


}

/*
 2.1 Dog Class:
      Attributes:
          name, age,
}*/
