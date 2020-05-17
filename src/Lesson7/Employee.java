package Lesson7;

import Homework.Lesson21.Employe;

public class Employee {
    protected int  salary;
    protected void dvZP(){
        System.out.println("Novaya zp = " + salary * 2);
    }
    protected Employee (int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvZP();

    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(700);
        System.out.println(emp1.salary);
        emp1.dvZP();
    }
}
 class Drugoy02 extends  Employee {

     Drugoy02(int salary) {
         super(salary);
     }

     public static void main(String[] args) {
        Employee emp = new Employee(300);
         System.out.println(emp.salary);
         emp.dvZP();
     }
 }