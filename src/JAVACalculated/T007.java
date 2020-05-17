package JAVACalculated;

public class T007 {
     static int a = 1;

    public static void main(String[] args) {
        Test006_123 t = new Test006_123();
        int[] array1 = {-3,2,0,8,1};
        int[] array2 = {9, 0, 10, 8, 10};
        System.out.println(array1[(array1 = array2)[1]]);
        do {

            System.out.println(a++);
        } while(a < 7);

    }
}
