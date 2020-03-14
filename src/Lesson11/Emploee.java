package Lesson11;

public class Emploee {
    public String name;
    public double salary;

    Emploee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uvel(double a) {
        a = a * 2;
        return a;
    }
    public double zp2() {
        salary = salary * 2;
        return salary;
    }
}
class EmploeeTest {
public static void main(String[]args){
        Emploee emp1 = new Emploee("Ivan", 100.5);
        double d = emp1.uvel(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
        emp1.zp2();
        System.out.println(emp1.salary);
        }
        }