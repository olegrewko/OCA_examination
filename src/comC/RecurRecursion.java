package comC;

public class RecurRecursion {
    static byte n = 0;

    public static void main (String[] args) {
//        some();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
    }

    private static void some () {
        n = (byte) (n + 1);
        System.out.printf("%d\t", n);
        some();
    }
}
