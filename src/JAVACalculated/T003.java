package JAVACalculated;


import java.util.Arrays;
import java.util.Scanner;

public class T003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Введите первое число k: ");
        int k = scanner.nextInt();
        System.out.print("Введите второе число t: ");
        int t = scanner.nextInt();
        System.out.print("Введите третье число n: ");
        int n = scanner.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = k * (i - t);
            arr2[i] = k + t - i;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
