package Lesson23;

 class Human2 {
     Human2 (String name, String surname) {
         this.name = name;
         this.surname = surname;
     }
     String name;
     String surname;
}
class Student2 extends Human2 {
     int  course;
     Student2 (String name, String surname, int course) {
         super(name, surname);
         this.course = course;
     }

    public static void main(String[] args) {
        Student2 s = new Student2("Kolya", "Ivanov", 3);
        System.out.println(s.name);
        System.out.println(s.surname);
        System.out.println(s.course);
    }

}
