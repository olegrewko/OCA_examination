package IgorDolgov.tern_example;

public class Main02 {
    public static void main (String[] args) {
        int[] ints = {4, 2, 99, 1, 42, 20, 30};

        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++) {

                if(ints[i] < ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        for (int i = 0; i < ints.length ; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
