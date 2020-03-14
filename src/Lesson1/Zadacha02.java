package Lesson1;

public class Zadacha02 {
    public static final double PI=3.14;

    public double plo(double radius) {
        double pl = PI*radius*radius;
        return pl;
    }
    public  static double dl(double radius2) {
        double dl = 2*PI*radius2;
        return dl;
    }
    public void info(double radius3) {
        System.out.println("Радиус "+ radius3);
        System.out.println("Площадь "+ plo(radius3));
        System.out.println("Длина окружности "+ dl(radius3));
    }

}
class Zadacha02Test {
    public static void main(String[] args) {
       Zadacha02 z = new Zadacha02();
       z.plo(5);
       Zadacha02.dl(7.5);
       z.info(3);



    }
}