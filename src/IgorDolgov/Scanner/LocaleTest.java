package IgorDolgov.Scanner;

import java.util.Locale;
import java.util.Scanner;

public class LocaleTest {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("Country: " + locale.getCountry());
        System.out.println("Display country: " + locale.getDisplayCountry());
        System.out.println("Language: " + locale.getLanguage());
        System.out.println("Display language: " + locale.getDisplayLanguage());
        System.out.println("ISO3 Country: " + locale.getISO3Country());
        System.out.println("ISO3 Language: " + locale.getISO3Language());
        System.out.println("Variant: " + locale.getVariant());
 //       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
//        Double d = scanner.nextDouble();
//        System.out.println("d= " + d);
//        Scanner scanner = new Scanner(System.in);
//        double w = scanner.nextDouble();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());
//        Double d = scanner.nextDouble();
//        System.out.println("d= " + d);
//        Double w = scanner.nextDouble();
//        System.out.println("w= " + w);
        System.out.println("Введите дробное число");

        double w = 0.0;
        while (true) {
            if (scanner.hasNextDouble()) {
                w = scanner.nextDouble();
                break;
            } else {
                String temp = scanner.nextLine();
            }
        }
        System.out.println("echo" + w);
    }
}
