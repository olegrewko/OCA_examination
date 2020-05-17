package Homework.Lesson9;

public class Test01 {
 //   int a = 1;
    static int a = 2;
    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test01 t = new Test01();
        t.abc(300);
    }
}
