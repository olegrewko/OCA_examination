package Lesson8;

public class BankAccount {
    int id;
    String name;
    double ballance;

    public static void main(String[] args) {
        BankAccount MyBA = new BankAccount();
        BankAccount YourBA = new BankAccount();
        BankAccount HisBA = new BankAccount();

        MyBA.id = 1;
        MyBA.name = "Oleg";
        MyBA.ballance = 200;


        YourBA.id = 2;
        YourBA.name = "Mike";
        YourBA.ballance = 400;

        HisBA.id = 5;
        HisBA.name = "Ivan";
        HisBA.ballance = 600;

    }
}
