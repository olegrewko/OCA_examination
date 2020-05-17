package JAVACalculated;

public class T008 {
    public static void abc()  {
        System.out.println("abc");
    }
    public void def(){
        System.out.println("def");
    }
    public static void hig(){
        abc();
 //       def();
    }

    public static void main(String[] args) {
        T008 t = null;
        t.hig();
    }
}
