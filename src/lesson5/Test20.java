package lesson5;

public class Test20 {
    int summa (int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
    int srarifm (int a1, int b1, int c1) {
        summa(a1,b1,c1);
        int result2 = summa(a1,b1,c1)/3;
        return result2;
    }

}
 class Test21 {
     public static void main(String[] args) {
         Test20 t = new Test20();
         int stc = t.summa(1,2,3);
         System.out.println(stc);
         System.out.println(t.srarifm(20,20,20));
     }
}


