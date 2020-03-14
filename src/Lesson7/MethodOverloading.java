package Lesson7;

public class MethodOverloading {
    void showInt(int i1) {
        System.out.println(i1);
    }
    void showBoolean(boolean b1) {
        System.out.println(b1);
    }
    void showString(String s1) {
        System.out.println(s1);
    }
}
class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.showInt(a);
        boolean b = true;
        mO.showBoolean(b);
        String s = "Privet";
        mO.showString(s);





    }
}
