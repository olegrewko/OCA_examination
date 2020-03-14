package Lesson800;

public class Test1 {

    public final int a;
    final static short s = 20;

    Test1() {
    a = 10;
    }

    public static void abc( ) {

        byte b = 10;

        System.out.println(s+b);
    }

    public static void main(String[] args) {

        Test1 t = new Test1();
        System.out.println(t.a);
        abc();
    }
}

