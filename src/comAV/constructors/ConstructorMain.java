package comAV.constructors;

import comAV.domainmodel.Employee;

import java.util.Date;


public class ConstructorMain {
    public static void main(String[] args) {
        Date date = new Date();
        Employee employee = new Employee("Alex", "developer", 200);
        Employee employee1 = new Employee("John", "developer", 400, "IT");
        Employee employee2 = new Employee("Mary", "developer", 300);
        Employee employee3 = new Employee("Mike", "proger", 100, "IT");

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }


}
