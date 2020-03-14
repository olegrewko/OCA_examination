package Homework;

public class Lesson11 {
}
class Car {
    String color;
    String engine;
    int doorCount;

    public  Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }
}
class CarTest {
    void changeDoorCount(Car c, int doorCount) {
        c.doorCount = doorCount;
    }
    void changeColor(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("red", "V4", 2);
        Car car2 = new Car("yellow", "V8", 4);
        ct.changeDoorCount(car1, 3);
        ct.changeColor(car1, car2);
        System.out.println("Первая машина : Цвет:"+car1.color+"Мотор"+car1.engine+"Кол-во дверей"+car1.doorCount);
        System.out.println("Вторая машина : Цвет:"+car2.color+"Мотор"+car2.engine+"Кол-во дверей"+car2.doorCount);
    }
}
