package week08_review;
import java.util.ArrayList;
public class Company {// Company Has An Employee

    private String companyName, location;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String companyName, String location) {
        setCompanyName(companyName);
        setLocation(location);
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void hireEmployee(Employee employee){

        if( employee == null){
            System.err.println("Can not add null as an Employee to the employees list");
            System.exit(1);
        }
        employees.add(employee);
    }


    public void hireEmployee(Employee[] employees){
        for (Employee employee : employees) {
            hireEmployee(employee);
        }
    }

    public void fireEmployee(String id){
        employees.removeIf( p -> p.getEmployeeId().equalsIgnoreCase(id));
    }


    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                ", total number of employees=" + employees.size() +
                '}';
    }


    public void displayEmployeesInfo(){
        System.out.println("Company: " + companyName);
        for (Employee eachEmployee : employees) {
            System.out.println("------------------");
            eachEmployee.displayInfo();
        }
    }


}

/*
5. Create a class named Company with the following specifications:
     Attributes:
       - companyName (String)
       - location (String)
       - employees (ArrayList)

     Encapsulate the fields, but only generate getter for the employees ArrayList.

     Add a constructor that can set the companyName and location when the company object is created.

     Actions:
       - hireEmployee(Employee): takes an employee object and adds it to the employees list

       - fireEmployee(id): removes the employee with the given id from the employees list

       - toString(): returns the String representation of the company object which includes the companyName, location and total number of the employees.

       - displayEmployeesInfo(): displays the information of the employees in the company
 */

