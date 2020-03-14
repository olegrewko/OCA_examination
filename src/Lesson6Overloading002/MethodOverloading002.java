package Lesson6Overloading002;

public class MethodOverloading002 {
    int sum(int i1, int i2) {
        return i1 + i2;
    }

    String sum (String s1, String s2) {
      return  s1+s2;
    }
}
class MethodOverloading005Test {
    public static void main(String[] args) {
        MethodOverloading002 mo2 = new MethodOverloading002();
        int a = mo2.sum(5,7);
        System.out.println(a);
        String s = mo2.sum("privet", "moi drug");
        System.out.println(s);

    }
}