package week09_review;

public class Test {
    public static void main(String[] args) {

        //   throw new InvalidNameException("The name of animal can not be empty");

        //    throw new InvalidAgeException("Age can not be negative");

        //    throw new InvalidGenderException("Gender can not be null");

        // Animal animal = new Animal("Animal", 20, "Unknown", "Male", "White");
        //  System.out.println(animal);

        Dog dog = new Dog("Loui", 5, "Yorkie", "Male", "Silver");
        System.out.println(dog.toString());

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.play();
        dog.bark();

        dog.setAge(2);
        dog.setName("LOUI");

        System.out.println(dog.toString());

        System.out.println("---------------------------");

        Dog dog2 = new Dog("Max", 4, "Husky", "Male", "White");

        System.out.println(dog2);
        dog2.eat();

        System.out.println("---------------------------");


        WildAnimal animal = new Lion("Max", 4, "Husky", "Male", "White");

        animal.hunt();
        ((Lion) animal).eat();
        ((Lion) animal).drink();
        ((Lion) animal).sleep();


        System.out.println("------------------------------------");

        Animal[] animals = {dog2, (Animal) animal};


    }
}
