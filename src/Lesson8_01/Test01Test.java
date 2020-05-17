package Lesson8_01;

  class Test01 {
       final static int b = 10;



 static int  abc(int a) {

        int c = a + b;
    return c;
}



}
      public class Test01Test{
    public static void main(String[] args) {


     int f = Test01.abc(40);
        System.out.println(f);
    }

}