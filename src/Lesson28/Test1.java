package Lesson28;
import java.time.*;
public class Test1 {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
        LocalDate ld1 = LocalDate.of(2014,5,15);
        System.out.println(ld1);
        ld1 = ld1.plusDays(17);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2014,Month.APRIL,15);
        System.out.println(ld2);
        LocalTime lt1 = LocalTime.of(15,30,45);
        System.out.println(lt1);
        LocalDateTime ldt1 = LocalDateTime.of(2015,9,10,17,25);
        System.out.println(ldt1);
        LocalDateTime ldt3 = LocalDateTime.of(ld1,lt1);
        System.out.println(ldt3);
    }
}
