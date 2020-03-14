package Lesson6Overloading;

public class MethodOverloading {
    void show (int a1)
    {
        System.out.println(a1);
    }


    void show (String s, int a) {

        System.out.println("String "+s+" int "+ a);
    }

    void show (boolean b1) {

        System.out.println(b1);
    }
}
class MethodOverloadingTest {
    public static void main(String[] args) {
      MethodOverloading mo = new MethodOverloading();
      int a1 = 500;
      mo.show(a1);
      boolean b = true;
      mo.show(b);
      String s = "Строка";
      int a = 800;
      mo.show(s, a);
    }
}