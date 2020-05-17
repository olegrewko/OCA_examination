package Lesson27;

public class Test2 {
    public static void main(String[] args) {
        int array [] = {1, 4, 0};
        System.out.println("U nas est");
       try {
           System.out.println(array[5]);
           System.out.println("Vsem");
       }
       catch(ArrayIndexOutOfBoundsException e) {
           System.out.println("Poimali");
       }
        System.out.println("U nas est");
    }
}
