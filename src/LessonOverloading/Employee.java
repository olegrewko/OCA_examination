package LessonOverloading;

public class Employee {


    Employee(int id2, String name2, int age2) {
        this(id2, name2, age2, 0.0, null);
 //       this(name2, age2);
 //       id = id2;
 //       name = name2;
 //       age = age2;
    }
   Employee(String name3, int age3) {
        this(0,  name3, age3, 0.0, null);
  //     name = name3;
  //     age = age3;

    }
    Employee(int id4, String name4, int age4, double salary4, String department4) {
        id = id4;
        name = name4;
        age = age4;
        salary = salary4;
        department = department4;
    }
    int id;
    String name;
    int age;
     double salary;
    String department;

}
class EmloyeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println( emp1.id);
        System.out.println( emp1.name);
        System.out.println( emp1.age);
        Employee emp2 = new Employee("Petrov", 30);
        System.out.println( emp2.id);
        System.out.println( emp2.name);
        System.out.println( emp2.age);
        System.out.println( emp2.name);
        Employee emp3 = new Employee( 2, "Sidorov", 40, 100.5, "IT");
        System.out.println( emp3.id);
        System.out.println( emp3.name);
        System.out.println( emp3.age);
        System.out.println( emp3.salary);
        System.out.println(emp3.department);

    }
}