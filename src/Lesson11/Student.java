package Lesson11;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    public static void swap(Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
    public static void changeName(Student s1) {
        s1.name = "Vasiliy";

    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan",3,7.9);
        Student st2 = new Student("Petr",5,4.9);
        swap(st1, st2);
        System.out.println(st1.name);
        System.out.println(st2.name);
        changeName(st2);
        System.out.println(st2.name);
    }
}
