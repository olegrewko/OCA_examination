package JAVACalculated;

public class Test006_123 {
    static int x = abc(1);
    {
        x = abc(2);
    }
    static {
        x = abc(3);
    }


    static int abc(int i) {
        System.out.println(i);
        return i;
    }

}
