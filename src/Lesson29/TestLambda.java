package Lesson29;
import java.util.ArrayList;
public class  TestLambda {
}

    class Student03 {
        String name;
        char sex;
        int age;
        int course;
        double avgGrade;

        Student03(String name, char sex, int age, int course, double avgGrade) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.course = course;
            this.avgGrade = avgGrade;
        }
    }

class StudentInfo03 {
    void printStudent(Student03 st) {
        System.out.println("Imia studenta:" + st.name + ", pol: " + st.sex + ", vozrast" + st.age + ", kurs: " +
                st.course + ", sred ocenka: " + st.avgGrade);
    }


    void testStudent03(ArrayList<Student03> al, StudentCheks03 sc) {
        for (Student03 s : al) {
            if (sc.test(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student03> list = new ArrayList<>();
        Student03 st1 = new Student03("Ivan", 'm', 22, 3, 8.3);
        Student03 st2 = new Student03("Nikolay", 'm', 28, 2, 6.4);
        Student03 st3 = new Student03("Elena", 'f', 19, 3, 9.2);
        Student03 st4 = new Student03("Ivan", 'm', 20, 3, 8.2);
        Student03 st5 = new Student03("Petr", 'm', 35, 4, 6.2);
        Student03 st6 = new Student03("Maria", 'f', 23, 3, 15.2);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);

        StudentInfo03 si = new StudentInfo03();

        si.testStudent03(list, (Student03 s) -> { return s.avgGrade > 8.5; });
        System.out.println("------------------------------------10L");
        si.testStudent03(list,  s ->  s.avgGrade < 9);
        System.out.println("------------------------------------20L");
        si.testStudent03(list, (Student03 s) -> { return s.age > 25; });
        System.out.println("------------------------------------30L");
        si.testStudent03(list, (Student03 s) -> { return s.sex == 'm'; });
        System.out.println("------------------------------------40L");
        si.testStudent03(list, (Student03 s) -> { return s.sex == 'f'; });
        System.out.println("------------------------------------50L");
        si.testStudent03(list, (Student03 s) -> { return s.avgGrade > 7.5 && s.age < 23 && s.sex == 'f'; });
        System.out.println("------------------------------------60L");
    }
}
    interface  StudentCheks03 {
        boolean test(Student03 s);
    }