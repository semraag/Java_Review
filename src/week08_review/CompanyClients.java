package week08_review;

public class CompanyClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Yazid", 30, 'M', "A01", 100_000);

        Employee employee2 = new Employee("Rabee", 30, 'F', "A02", 110_000);

        // Employee employee3 = null;

        Employee[] employees = {
                new Employee("Samira", 35, 'F', "A03", 115_000),
                new Employee("Samen", 40, 'M', "A04", 120_000),
                new Employee("Maksym", 25, 'F', "A05", 95_000)
        };

        Company google = new Company("Google Inc", "New York");

        google.hireEmployee( employee1 );
        google.hireEmployee( employee2 );
        // company1.hireEmployee( employee3);

        google.hireEmployee(employees);

        System.out.println(google);

        //  company1.fireEmployee("a03");
        //   company1.fireEmployee("a04");

        System.out.println(google);

        google.displayEmployeesInfo();

        System.out.println("--------------------------------------");

        Employee[] workers = {
                new Employee("Yassir", 31, 'M', "B01", 130_000),
                new Employee("Ayat", 31, 'F', "B02", 130_000),
                new Employee("Dina", 31, 'F', "B03", 130_000),
                new Employee("Daniel", 55, 'M', "B04", 140_000),
                new Employee("Yulia", 31, 'F', "B05", 160_000),
        };

        Company amazon = new Company("Amazon Inc", "San Fransisco");

        amazon.hireEmployee(workers);

        System.out.println(amazon);
        amazon.displayEmployeesInfo();


        System.out.println("--------------------------------------");

        Company microsoft = new Company("Microsoft Inc", "Denver");

        // Add 5 employees to the microsoft


        System.out.println("--------------------------------------");

        Company[] companies = {google, amazon, microsoft};

        /*
        Find the employee that has the highest salary
        Find the employee that has the minimum salary
         */






    }

}
