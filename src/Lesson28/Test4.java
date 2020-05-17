package Lesson28;
import java.time.*;
public class Test4 {
    static void amenaDejurnogo(LocalDate nachalo, LocalDate konec) {
        LocalDate data = nachalo;
        while(data.isBefore(konec)){
            System.out.println("Nastupila " + data + "Pora meniat dejurnogo");
            data = data.plusMonths(1);
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo  = LocalDate.of(2016,Month.APRIL,1);
        LocalDate konec = LocalDate.of(2017,Month.APRIL,29);
        Period p = Period.ofMonths(2);
        amenaDejurnogo(nachalo, konec);
    }

}
