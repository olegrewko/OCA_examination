package JAVACalculated;

public class T009 {
    int a = 3;
     public static T009 abc(T009 test1, T009 test2) {
         final T009 b = test1;
         b.a = 5;
         return b;
     }

    public static void main(String[] args) {
        final T009 t1 = new T009();
        T009 t2 = new T009();
        T009 t3 = abc(t1, t2);
        System.out.println(t1 == t3);
        System.out.println(t1.equals(t3));
        System.out.println(t1.a == t3.a);

    }
}
