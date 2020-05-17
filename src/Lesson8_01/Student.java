package Lesson8_01;



public class Student {
    public String name;
    public int course;
    public static int count;
    public int a;
    public Student(String name2, int course2) {
        count++;
        a++;
        name = name2;
        course = course2;
        System.out.println("Student #" + count + " sozdan");
    }
    public int  showCount() {
        System.out.println("Всего создано студентов " + count);
        return count;
    }
    public static void showInfo() {
        System.out.println("Welcome");
    }
    void abc(){
        count++;
    a++;
    }
    static void abcd(){
        Student st1 = new Student("Ivan", 1);
        count++;
        st1.a++;
        System.out.println(st1.name);
        System.out.println(st1.course);
    }
    public static void main(String[] args) {
        abcd();

        Student st3 = new Student("Masha", 3);
        st3.abc();
        System.out.println(st3.name);
        System.out.println(st3.course);




    }
}
class StudentTest {
//    public static void main(String[] args) {
//        Student st1 = new Student("Ivan", 1);
//        Student st2 = new Student("Petr", 2);
//        Student st3 = new Student("Masha", 3);
//        System.out.println(Student.count);
//
//    }
}
