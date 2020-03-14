package Lesson20;
import java.util.ArrayList;
public class Test8 {
    public static void main(String[] args) {
    ArrayList <String> students = new ArrayList<>(4);
    students.add(0,"Ivanov");
    students.add(1,"Petrov");
    students.add(2,"Sidorov");
    students.add(3,"Rewko");
    students.remove(2);
    for (String s:students) {
        System.out.println(s + " ");
    }
    }
}
