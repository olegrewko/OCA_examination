package Lesson29;

import java.util.ArrayList;

public class Test1 {
}
 class  Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
//    конструктор
    Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
class StudentInfo {
    void printStudent(Student st) {
        System.out.println("Imia studenta:" + st.name + ", pol: " + st.sex + ", vozrast" + st.age + ", kurs: " +
                st.course + ", sred ocenka: " + st.avgGrade);
    }


    void printStudentOverGrade(ArrayList<Student> al, double avgGrade) {
        for(Student s : al){
            if(s.avgGrade > avgGrade) {
                printStudent(s);
            }

        }
    }
    void printStudentUnderGrade(ArrayList<Student> al, double avgGrade) {
        for(Student s : al){
            if(s.avgGrade < avgGrade) {
                printStudent(s);
            }

        }
    }
    void printStudentOverAge(ArrayList<Student> al, int age) {
        for(Student s : al){
            if(s.age > age) {
                printStudent(s);
            }

        }
    }
    void printStudentUnderAge(ArrayList<Student> al, int age) {
        for(Student s : al){
            if(s.age < age) {
                printStudent(s);
            }

        }
    }
    void printStudentBySex(ArrayList<Student> al, char sex) {
        for(Student s : al){
            if(s.sex == sex) {
                printStudent(s);
            }

        }
    }
    void printStudentMixCond(ArrayList<Student> al, double avgGrade, int age, char sex) {
        for(Student s : al){
            if(s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
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
        Student st5 = new Student("Petr", 'm', 35, 4, 6.2);
        Student st6 = new Student("Maria", 'f', 23, 3, 15.2);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);
        StudentInfo si = new StudentInfo();

        FindStudentOverGrade fsog = new FindStudentOverGrade();
        FindStudentUnderGrade fsug = new FindStudentUnderGrade();
        FindStudentOverAge fsoa = new FindStudentOverAge();
        FindStudentUnderAge fsua = new FindStudentUnderAge();
        FindStudentBySex fsbs = new FindStudentBySex();
        FindStudentMixCondition fsms = new FindStudentMixCondition();

        si.printStudentOverGrade(list, 8.5);
        System.out.println("----------------------------------1");
        si.printStudentUnderGrade(list, 9);
        System.out.println("----------------------------------2");
        si.printStudentOverAge(list, 25);
        System.out.println("----------------------------------3");
        si.printStudentUnderAge(list, 27);
        System.out.println("----------------------------------4");
        si.printStudentBySex(list, 'f');
        System.out.println("----------------------------------sex--f");
        si.printStudentBySex(list, 'm');
        System.out.println("----------------------------------sex--m");
        si.printStudentMixCond(list, 7.2, 23, 'f');

    }


}

