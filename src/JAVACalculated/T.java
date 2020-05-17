package JAVACalculated;


import java.util.Scanner;
public class T  {
    static Scanner scanner = new Scanner(System.in);
    private static char op;

    public static void main(String[] args) {
        int num1 = number();
//        char op = operation();
        int num2 = number();

        if (((num1 > 0) && (num2 < 0)) || ((num1 < 0) && (num2 >0)) ){
            op = '*';
            int result = calculated(num1, num2, op);
            System.out.println(result);
        } else {
            int result = num1 % num2;
            System.out.println(result);
        }
        if ((num1 > num2) || (num2 > num1) ){
            op = '-';
            int result = calculated(num1, num2, op);
            System.out.println(result);
        }else{
            int result = num1 % num2;
            System.out.println(result);

        }
        if ((num1 < 0) && (num2 < 0) ){
            op = '+';
            int result = calculated(num1, num2, op);
            System.out.println(result);
        }else{
            int result = num1 % num2;
            System.out.println(result);
        }


    }
    public static int number() {
        System.out.println("Введите число");
      int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }else{
            System.out.println("Ошибка, попробуйте еще раз");
            scanner.next();
            num = number();
        }
        return num;

    }

    public static int calculated(int num1, int num2, char op) {
        int result01 = 0;
        switch (op){
            case '+':
                result01 = num1 + num2;
                break;
            case '-':
                result01 = num1 - num2;
                break;
            case '*':
                result01 = num1 * num2;
                break;
            case '/':
                result01 = num1 / num2;
                break;
            default:
                System.out.println("Оператор не найден");


        }
        return result01;
    }
}
