package HomeworkLesson17;

public class Zadacha1 {
    static double umnojenie(double a, double b, double c) {
        return a*b*c;
    }
    static void del(int a, int b) {
        System.out.println("Целое частное = " + a/b + "; Остаток = " + a % b);
    }
}
class Zadacha1Test {
    public static void main(String[] args) {
        System.out.println(Zadacha1.umnojenie(1,2,3));
        Zadacha1.del(400, 300);
    }
}