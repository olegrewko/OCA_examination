package Lesson2;



public class Student {
    String name; // Переменные экземпляра Student
    public int course;
    static int count;// Переменная класса

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # "+ count + " sozdan");
    }

    public static void showCount() {
        System.out.println("Всего создано студентов " + count);

    }


    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 4);
        Student st3 = new Student("Masha", 2);

        System.out.println(count);
        System.out.println(Student.count);
        System.out.println(st1.count);
        System.out.println(st2.count);
        System.out.println();
        showCount();
        float f = 3.14f;
        int x = (int) f;
        System.out.println("x = " + x);

    }

}
