package Homework.Lesson9;

public class Test02 {
    int a = 1;
    static int b = 2;
    static void abc  (final int a) {
        System.out.println(a);
        System.out.println(Test02.b);
    }

    public static void main(String[] args) {
        abc(500);
    }
}
