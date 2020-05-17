package Lesson29;

import java.util.ArrayList;

public class Test2 {
}
class  Student02 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student02(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
class StudentInfo02 {
    void printStudent(Student st) {
        System.out.println("Imia studenta:" + st.name + ", pol: " + st.sex + ", vozrast" + st.age + ", kurs: " +
                st.course + ", sred ocenka: " + st.avgGrade);
    }




void testStudent(ArrayList<Student> al, StudentCheks sc) {
    for (Student s : al) {
        if (sc.test(s)) {
            printStudent(s);
        }
    }
}
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 3, 9.2);
        Student st4 = new Student("Ivan", 'm', 20, 3, 8.2);
        Student st5 = new Student("Petr", 'm', 21, 4, 6.2);
        Student st6 = new Student("Maria", 'f', 23, 3, 5.2);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);
        StudentInfo02 si = new StudentInfo02();

        FindStudentOverGrade fsog = new FindStudentOverGrade();
        FindStudentUnderGrade fsug = new FindStudentUnderGrade();
        FindStudentOverAge fsoa = new FindStudentOverAge();
        FindStudentUnderAge fsua = new FindStudentUnderAge();
        FindStudentBySex fsbs = new FindStudentBySex();
        FindStudentMixCondition fsms = new FindStudentMixCondition();

        si.testStudent(list, fsog);
        System.out.println("------------------------------------10");
        si.testStudent(list, fsug);
        System.out.println("------------------------------------20");
        si.testStudent(list, fsoa);
        System.out.println("------------------------------------30");
        si.testStudent(list, fsua);
        System.out.println("------------------------------------40");
        si.testStudent(list, fsbs);
        System.out.println("------------------------------------50");
        si.testStudent(list, fsms);
        System.out.println("------------------------------------60");



    }


}
interface  StudentCheks {
    boolean test(Student s);
}

class FindStudentOverGrade implements  StudentCheks {
    @Override
    public boolean test(Student s) {
        return s.avgGrade > 8.5;
    }
}
class FindStudentUnderGrade implements  StudentCheks {
    @Override
    public boolean test(Student s) {
        return s.avgGrade > 9;
    }
}
class FindStudentOverAge implements  StudentCheks {
    @Override
    public boolean test(Student s) {
        return s.age > 25;
    }
}
class FindStudentUnderAge implements  StudentCheks {
    @Override
    public boolean test(Student s) {
        return s.age < 27;
    }
}
class FindStudentBySex implements  StudentCheks {
    @Override
    public boolean test(Student s) {
        return s.sex == 'f';
    }
}
//class FindStudentBySex implements  StudentCheks {
//    @Override
//    public boolean testStudent(Student s) {
//        return s.sex == 'f';
//    }
//}
class FindStudentMixCondition implements  StudentCheks {
    @Override
    public boolean test(Student s) {

        return (s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f');
    }
}