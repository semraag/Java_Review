package week08_review;
import java.util.ArrayList;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {

        Person person1 = new Person("James", 39, 'M');
        Person person2 = new Person("Yulia", 45, 'F');
        Person person3 = new Person("Aaron", 65, 'M');

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        // person1.numberOfHeads = 3;

        //  System.out.println(person1.numberOfHeads);
        //  System.out.println(person2.numberOfHeads);
        //  System.out.println(person3.numberOfHeads);

        System.out.println(Person.numberOfHeads);
        System.out.println(Person.isHuman);
        System.out.println(Person.canBreath);

        //  person1.name = "12345";
        //  System.out.println(person1.name);


        //person1.setAge(-40);
        System.out.println(person1.getAge());


        /*
        Person var1 = new Person("Yazid", 25, 'M');
        Person var2 = var1;
        var1.name = "Julia";

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println(var1 == var2);


        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list2.addAll(Arrays.asList(6, 7, 8));

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
*/

        System.out.println("--------------------------------");

        Employee employee1 = new Employee("Samira",28, 'F', "A01", 100_000);

        System.out.println(employee1);

        employee1.displayInfo();

        employee1.work();

        System.out.println("------------------------------------");

        Developer developer1 = new Developer("Adam", 35, 'M', "A02", 120_000, "Java");

        System.out.println(developer1);

        developer1.displayInfo();

        developer1.work();

        System.out.println("------------------------------------");

        Manager manager1 = new Manager("Khasan", 50, 'M', "A03", 130_000, "IT");

        System.out.println(manager1);
        manager1.displayInfo();
        manager1.work();


        System.out.println("------------------------------------");


        // Developer developer = new Developer("Khasan", 50, 'M', "A03", 130_000, "Cydeo");

        //  developer.displayInfo();

        Person person = new Person("James", -45, 'M');

        System.out.println(person);



    }
}