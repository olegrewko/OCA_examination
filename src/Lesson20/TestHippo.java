package Lesson20;

import java.util.Date;

public class TestHippo {
    public static void main(String[] args) {
        System.out.println("Начало");
        Hippo h = new Hippo();
        System.out.println(String.format("%tc", new Date()));
        System.out.println(String.format("%tr", new Date()));
        Date today = new Date();
        System.out.println(String.format("%tA, %tB, %td",today, today, today));
        System.out.println(String.format("%d", 10000000));

    }
}
 class Animal {
    public Animal() {
        System.out.println("Создание Animal");
    }
}
class Hippo extends Animal {
    public Hippo() {
        System.out.println("Создание Hippo");
    }
}
