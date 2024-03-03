package week10_rewiew;

import week09_review.Animal;
import week09_review.Dog;
import week09_review.Lion;
import week09_review.Playable;

public class polymorphismPractice {

    public static void main(String[] args) {

        Animal obj;

        obj = new Dog("Loui", 5, "Yorkie", "Male", "Silver");

        System.out.println(obj);

        obj.eat();
        obj.drink();
        obj.sleep();
        ((Dog) obj).play();
        ((Dog) obj).bark();

        //    ( (Eagle)obj ).fly();

        ((Playable) obj).play();

        ((Lion) obj).hunt();


        //  obj = new Cat("Loui", 5, "Yorkie", "Male", "Silver");

        //  System.out.println(obj);

        // ...

        /*

        WebDriver driver;

        driver = new Chrome();
        ......

        driver = new FireFox();
        ......

        driver = Safari()
        ...


         */


    }
}