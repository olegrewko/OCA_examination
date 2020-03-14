package Lesson10;

public class Test {
    int a = 1;
    static int b = 2;
    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test.b);



    }

    public static void main(String[] args) {
        Test t = new Test();
        t.abc(4);
    }

}
