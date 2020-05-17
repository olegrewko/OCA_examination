package IgorDolgov.seabattle;

import java.util.Scanner;

public class Player {
    String name;

     int getShoot() {
        int shoot;
        Scanner scanner = new Scanner(System.in);


        while (true) {
            if (scanner.hasNextInt()) {
                shoot = scanner.nextInt();
                break;
            } else {
                String temp = scanner.nextLine();
            }
        }
        System.out.println("Ваш выстрел: " + shoot);
        return shoot;

    }
}
