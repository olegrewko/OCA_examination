package Homework.Lesson19;

public class Test2massiv {

        static void summa( int [] a) {
            int summa = 0;
            for (int i = 0; i < a.length; i++) {
                summa += a[i];
            }
            System.out.println(summa);

        }

        public static void main(String[] args) {
            summa( new int[] {500, 500, 1000, 700});
        }

}
