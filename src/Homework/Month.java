package Homework;

public class Month {

    public static void dayQuantity(int n) {
        switch (n) {
            case 2:
                System.out.println("28");
                break;
                case 4:
                case 6:
                case 8:
                case 10:
                    System.out.println("30");
                    break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println("Такого дня нет");
            }
        }

    public static void main(String[] args) {
        Month.dayQuantity(0);
        dayQuantity(1);
        Month.dayQuantity(2);
        dayQuantity(4);
        Month.dayQuantity(-5);
    }
    }


