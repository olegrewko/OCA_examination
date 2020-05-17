package IgorDolgov;

public class Recursia {
    public static void main (String[] args) {
        fibonachi(0, 1);
    }

    public static void fibonachi (int i, int k) {
        int sum = i + k;
        System.out.print(sum + " ");
        if (sum > 300000) {
            return;
        }
        fibonachi(k, sum);
    }
}
