package lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;
    void Info() {
        System.out.println("Имя: "+name+" cvet mashini: " + car.color + " Ballance bank ccheta: " + bA.ballance);
    }
}
class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("red", "V200");
        h.bA = new BankAccount(18, 200.5);

        h.Info();
    }
}
class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }
    String color;
    String engine;
}
 class BankAccount {
    BankAccount(int id2, double ballance2){
        id = id2;
        ballance = ballance2;
    }
    int id;
    double ballance;

 }
