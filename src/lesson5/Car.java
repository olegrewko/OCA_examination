package lesson5;

public class Car {
 void Car(String cvet, String motor) {
        color = cvet;
        engine = motor;
       System.out.println("Цвет машины " + color + " Мотор " + engine);
    }
    String color;
    String engine;
}
class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        car1.color = "black";
        car1.engine = "V8";


        System.out.println(car1.engine);
        System.out.println(car1.color);
        System.out.println(car2.engine);
        System.out.println(car2.color);
    }
}