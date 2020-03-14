package Homework.Lesson19;

public class Test9 {
    public static void main(String[] args) {

        int [] array1 = {0, 1, -2, 4, 5};
        int [] array2 = {-9, 1, 2, 4, 5};
        for(int i=0; i < array1.length && i < array2.length; i++) {
            array1[i] = 12;
           // array2[i] = 3;
            System.out.print(array1[i] + " ");
           // System.out.print(array2[i]);
        }

    }
}
