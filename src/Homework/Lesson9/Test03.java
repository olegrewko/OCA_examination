package Homework.Lesson9;

public class Test03 {
    int a = 1;
    static int b = 2;
    void abc(int a) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(this.a);
        System.out.println(Test03.b);

    }
    public static void main(String[] args) {
       Test03 t = new Test03();
       t.abc(400);
    }
}
