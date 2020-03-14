package Homework.Lesson21;

public class Employe {
    Employe manager = new Employe();

}
class  TestEmploye {
    public static void main(String[] args) {
        Employe e = null;
        e = new Employe();
        e = null;
    }
}
// бесконечная рекурсия