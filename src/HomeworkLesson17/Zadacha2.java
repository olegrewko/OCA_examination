package HomeworkLesson17;

import jdk.swing.interop.SwingInterOpUtils;

public class Zadacha2 {
    public static final double PI = 3.14;

    public double plo(double radius) {
        double s = PI * radius * radius;
        return s;
    }
    public static double dlina(double radius2) {
        double dl = 2 *PI * radius2;
        return dl;
    }
    public void info(double radius3) {
        System.out.println("Радиус = " + radius3);
        System.out.println("Площадь круга = " + plo(radius3));
        System.out.println("Длина окружности = " + dlina(radius3));
    }
}
class Zadacha2Test {
    public static void main(String[] args) {
        Zadacha2 z = new Zadacha2();
        double f = z.plo(5);
        System.out.println(f);
        double u = Zadacha2.dlina(100);
        System.out.println(u);
        z.info(10);

    }
}