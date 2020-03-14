package Lesson13;

public class Employee {
    public static void main(String[] args) {
//        switch ("ponedelnik") {
//            case "ponedelnik":
//                System.out.println("Rabota do 18:00");
//                break;
//            case "vtornik":
//                System.out.println("Rabota do 18:00");
//                break;
//            case "sreda":
//                System.out.println("Rabota do 18:00");
//                break;
//            case "sub":
//                System.out.println("Rabota do 14:00");
//                break;
//            default:
//                System.out.println("Такого дня нет");
//        }
        int dn = 2;
        final int a=1 ;

        final int b=2 ;


        switch (dn*3) {

            case 1:
                System.out.println("Rabota do 18:00");
                break;
            case a * b:
                System.out.println("Rabota do 18:00");
                break;
            case 3:
                System.out.println("Rabota do 18:00");
                break;
            case 6:
                System.out.println("Rabota do 14:00");
                break;
            case 7:
                System.out.println("Rabota NET");
                break;
            default:
                System.out.println("Такого дня нет");
        }
    }
}
