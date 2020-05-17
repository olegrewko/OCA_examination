package IgorDolgov.horserasing;

import java.util.Scanner;

public class Player {
    String name;
    int money;
    int selectHorse(){
        int horseNmb;
        Scanner scanner = new Scanner(System.in);
        horseNmb = scanner.nextInt();
        return horseNmb;
    }
}
