package TC;

 class A {
    int ivar = 7;
    void m1() {
        System.out.print("As m1, ");
    }
    void m2() {
        System.out.print("As m2, ");
    }
    void m3() {
        System.out.print("As m3, ");
    }
}
class B extends A {
    void m1() {
        System.out.print("Bs m1, " + (ivar + 6));
    }
}
class C extends B {
    void m3() {
        System.out.print("Cs m3, ");
    }
}
public class Mixed2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        a2.m1();
        a2.m2();
        a2.m3();
//        c.m1();
//        c.m2();
//        c.m3();
    }

}
