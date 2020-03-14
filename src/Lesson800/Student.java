package Lesson800;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan");
    }

   public static void showCount() {
        System.out.println("Vsego sozdano studentov "+ count);
    }
    public  void showInfo() {
        System.out.println("Welcome ");
    }
    void abc() {
        a++;
        count++;
    }
    static void abcd() {
        count++;
        Student st2 = new Student("Petr", 4);
        st2.a++;
    }
        public static void main(String[] args) {
            Student st1 = new Student("Ivan", 1);


            System.out.println(st1.name);
            System.out.println(count);
            showCount();
            Student st3 = new Student("Masha", 2);
            st3.abc();

            abcd();
        }
    }
