package week08_review;

public class Manager extends Employee{
    private String department;

    public Manager(String name, int age, char gender, String employeeId, double salary, String department) {
        super(name, age, gender, employeeId, salary);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing " + department + " department" );
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

/*
4. Create another subclass of Employee named Manager with the following specifications:
     Attributes:
       - department (String)

     Encapsulate the fields.
     Add a constructor that can set all the fields when the Manager object is created.
     Override the work and displayInfo methods.
 */

