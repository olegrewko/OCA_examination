package Homework.Lesson19;

public class Test222 {
    static void summa(String s, int ... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
        System.out.println(s);
    }

    public static void main(String[] args) {
        summa("ok", 500, 600, 1000);
    }
}
