package Lesson1;

public class Zadacha {
    static double umno(double a, double b, double c) {
        return a*b*c;

    }
    static void del(int a, int b) {
        System.out.println("Целое частное "+ a/b + " Остаток "+ a%b);

    }
}
class ZadachaTest {
    public static void main(String[] args) {
        System.out.println(Zadacha.umno(1, 2, 3));
        Zadacha.del(10, 5);
        System.out.println(Zadacha.umno(1.5, 2.5, 3.5));
        Zadacha.del(100, 5);
    }
}