package Lesson09;

public class Car {
    String color;//Переменные экземпляра
    int a = 10;
    String engine;
    static int count;

    public static void changeA(int b) {
        count++;
        Car c = new Car("black", "V5");
        c.a = b;
    }

    Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }
    public void showColor() {
        System.out.println("Цвет машины " + color);
       changeColor("red");
    }
    public void changeColor(String color3) {
        System.out.println("Цвет машины изменился " );
        int cena = 5000;
        color = color3;
        cena += 1000;


    }


}
