package HomeworkLesson22;

import javax.swing.*;

public class Student {
    private int course;
    private int grade;
    private StringBuilder name;
    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
        this.name = name;
    }
}
    public int getCourse() {
    return course;
    }
    public void setCourse(int course) {
      if(course >= 1 && course < 5) {
          this.course = course;
      }
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        if(grade >= 1 && grade < 11) {
            this.grade = grade;
        }
    }
    public  void showInfo () {
        System.out.println("Имя: "+getName()+"курс: "+getCourse()+"оценка: "+ getGrade());
    }
    }
class TestStudent   {
public static void main(String[]args){
    Student st1 = new Student();
    StringBuilder sb1 = new StringBuilder("Ivan");
    st1.setName(sb1);
    st1.setCourse(3);
    st1.setGrade(7);
    st1.showInfo();
    JFrame frame = new JFrame("Hello Java");
    JLabel label = new JLabel("Hello Java", JLabel.CENTER);
    frame.add(label);

    frame.setSize(300, 300);
    frame.setVisible(true);

        }
        }
