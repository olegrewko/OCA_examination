package ZaurLesson04;

public class Student {

   public Student(int studentId2, String name2, String family2, int course2, double mathAverageGrade2, double economicAverageGrade2,
                  double foreignLanguageGrade2) {

       studentId = studentId2;
        name = name2;
        family = family2;
       course = course2;
       mathAverageGrade = mathAverageGrade2;
       economicAverageGrade = economicAverageGrade2;
       foreignLanguageGrade = foreignLanguageGrade2;

    }
    Student(int studentId3, String name3, String family3, int course3) {

      this( studentId3, name3,  family3,  course3, 0, 0, 0);

    }

    Student() {
   }

    int studentId;
    String name;

    String family;
    int course;
    double mathAverageGrade;
    double economicAverageGrade;
    double foreignLanguageGrade;

}
class StudentTest {
    public static void main(String[] args) {
        Student st01 = new Student();
        st01.studentId = 1;
        st01.name = "Nikolay";
        st01.family = "Kondakov";
        st01.mathAverageGrade = 5;
        st01.economicAverageGrade = 3;
        st01.foreignLanguageGrade = 10;
        Student st02 = new Student();
        st02.mathAverageGrade = 2;
        st02.economicAverageGrade = 30;
        st02.foreignLanguageGrade = 1;
        st02.studentId = 50;
        st02.name = "Vasia";
        st02.family = "Vasiliev";
        Student st03 = new Student();
        st03.mathAverageGrade = 150;
        st03.economicAverageGrade = 130;
        st03.foreignLanguageGrade = 10;
        st03.studentId = 3;
        st03.name = "Vasia";
        st03.family = "Vasiliev";

    }
}
