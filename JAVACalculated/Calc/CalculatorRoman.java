package JAVACalculated.Calc;
public class CalculatorRoman extends CalculatorArabian {
    public static int number() {
        System.out.println("Введите римскую цифру от I до Х ");

        String userroman = scanner.nextLine();
        if (userroman.equals("I")) {
            return 1;
        } else if (userroman.equals("II")) {
            return 2;
        } else if (userroman.equals("III")) {
            return 3;
        } else if (userroman.equals("IV")) {
            return 4;
        } else if (userroman.equals("V")) {
            return 5;
        } else if (userroman.equals("VI")) {
            return 6;
        } else if (userroman.equals("VII")) {
            return 7;
        } else if (userroman.equals("VIII")) {
            return 8;
        } else if (userroman.equals("IX")) {
            return 9;
        } else if (userroman.equals("X")) {
            return 10;
        } else {


            return -1;

        }
    }


}
