package Lesson26;

import Lesson10.Test;

public class Test3 {
    void abc(int i) {
        System.out.println("int");
    }

    void abc(long i) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(5);
    }
}
