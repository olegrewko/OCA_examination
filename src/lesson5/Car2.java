package lesson5;

public class Car2 {
    String color;
    String engine;
    int speed;
     int gaz(int skorost) {
         speed += skorost;
         return speed;
     }
      int tormoz(int skorost) {
         speed -= skorost;
         return speed;
      }
      void shoWInfo() {
          System.out.println("cvet: "+ color +" motor: "+ engine + " skorost: "+ speed);

      }

}
class car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color="white";
        c1.engine="V6";
        c1.speed= 60;

         c1.shoWInfo();
         c1.gaz(100);
        c1.shoWInfo();
        c1.tormoz(100);
        c1.shoWInfo();


    }
        }
