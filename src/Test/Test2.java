package Test;

 class Test {
    static int a = 1;
    static int b = 2;
    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
        System.out.println(this.b);
        System.out.println(Test.b);
        System.out.println(Test.a);
    }

    public static void main(String[] args) {
       Test t = new Test();
       t.abc(4);
    }

}
//public  class Test2 {
//    int a = 1;
//    static int b = 2;
//
//
//   static void  abc(final int  a) {
//        System.out.println(a);
//        System.out.println(Test2.b);
//    }
//
//    public static   void main(String[] args) {
//        abc(5);
//    }
//
//}