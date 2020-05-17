package Lesson10;


import Lesson8_01.*;


public class A {
    public static void main(String[] args) {
        Student s2 = new Student("oleg", 10);
        System.out.println(s2.name);
        System.out.println(s2.course);
        System.out.println(s2.showCount());
        System.out.println(Student.count);
    }
}
