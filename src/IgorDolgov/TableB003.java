package IgorDolgov;

public class TableB003 {


    public static void main (String[] args) {
        for (int k = 0; k < 2; k++) {
            for (int j = 1; j < 10; j++) {
                for (int i = 1; i < 10; i++) {
                    System.out.printf("%5d", i * j);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}