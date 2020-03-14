package Homework.Lesson5;

public class BankAccount {
    int id = 10;
    String name = "Petr";
    double ballance = 100;

     void popolnenieCheta(double summaPopolnenia) {
         System.out.println("Ballance do popolnenia: "+ballance);
         System.out.println("Ballance pop na: " + summaPopolnenia );
         ballance += summaPopolnenia;
         System.out.println("Ballance posle popolnenia: " + ballance);
         System.out.println();

     }

    void sniatieCheta(double summaSniatia) {
        System.out.println("Ballance do popolnenia: "+ballance);
        System.out.println("Ballance pop na: " + summaSniatia );
        ballance -= summaSniatia;
        System.out.println("Ballance posle sniatia: " + ballance);
        System.out.println();

    }

}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        MyAccount.popolnenieCheta(500);
        MyAccount.sniatieCheta(500);
    }
}