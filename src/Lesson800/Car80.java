package Lesson800;

public class Car80 {
    String color = "blue";
    String engine = "V6";
}
class  Human  {
    String name = "Ivan";
    Car80 c = new Car80();

public static void main(String[]args){
        Human h1 = new Human();
        h1.c = new Car80();
        h1.c = new Car80();
        h1.c.engine = "V8";

        }
}
