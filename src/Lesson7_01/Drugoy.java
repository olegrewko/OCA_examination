package Lesson7_01;


import Lesson7.*;
public class Drugoy extends Employee {

    Drugoy(int salary) {
        super(salary);
    }

        public static void main(String[] args) {

            Drugoy emp8 = new Drugoy(900);
            System.out.println(emp8.salary);
            emp8.dvZP();
        }
}
