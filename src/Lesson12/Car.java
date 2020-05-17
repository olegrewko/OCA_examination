package Lesson12;

 public  class Car {
    String color;
    String engine;
    static int count;
    int doorCount;
    float m;

   public Car(String color, String engine2, int doorCount, float m) {
       count++;
       this.color = color;
       this.engine = engine2;
       this.doorCount = doorCount;
       this.m = m;
    }

    public void showColor( String color, String engine2) {
        System.out.println("Цвет машины: " + color);

    }
    public void changeColor(String color3) {
        System.out.println("Цвет машины изменился: "+ color3 );
        int cena = 5000;
        color = color3;
        cena += 1000;
    }
}
 class CarTest {
    public static void main(String[] args) {
    Car car = new Car("red", "v6", 2, 80.5f);
        System.out.println(car.color);
        car.showColor("red", "v6");
    car.changeColor("black");
        System.out.println("Зарплата маленькая");
        Car c1 = new Car("green", "V10", 4, 190.5f);
        Car c2 = new Car("orange", "V5", 2, 100.5f);

        if (c1.m > c2.m && c1.doorCount > c2.doorCount) {
            System.out.println("Тачка зеленая круче");
            } else {
                System.out.println("Тачка оранжевая круче");
            }





    }
}
