package IgorDolgov.tern_example;

public class Main {
    public static void main(String[] args) {
         multiplyNumbers(2,6);
        System.out.println("----------------------------------");
        multiplyNumbers2(6,10);
    }

    public static void multiplyNumbers(int from, int to) {
        for (int i = 2; i < 10; i++) {
            for (int j = from - 1; j < to; j++) {
                System.out.printf("%d*%d=%d\t", i, j, i * j);
            }
            System.out.println();
        }
    }

    public static void multiplyNumbers2(int from, int to) {
        for (int i = 2; i < 10; i++) {
            for (int j = from - 1; j < to; j++) {
                System.out.printf("%d*%d=%d\t", i, j, i * j);
            }
            System.out.println();
        }
    }
}
