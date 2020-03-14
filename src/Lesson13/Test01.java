package Lesson13;

public class Test01 {

}
class Student {
    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(6);
//        if(st1.grade == 2) {
//            System.out.println("Студент двоечник");
//        }
//        else if (st1.grade==3) {
//            System.out.println("Студент троечник");
//
//        }
//        else if (st1.grade==5) {
//            System.out.println("Студент отличник");
//
//        }
//        else {
//            System.out.println("Оценка неверна");
//        }
//    }
        switch (st1.grade) {
            case 2:
                System.out.println("Студент двоечник");

            case 4:
                System.out.println("Студент хорошист");

            case 3:
                System.out.println("Студент троечник");

            case 5:
                System.out.println("Студент отличник");

            default:
                System.out.println("default");

        }
    }
}