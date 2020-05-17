package IgorDolgov.seabattle;

public class SeaBattle {
//    static int shoot;

    public static void main (String[] args) {
        doGame();
    }

    private static void doGame () {
       Field field = new Field();
       Player player = new Player();
       Ship ship = new Ship();
       ship.position = 4;
       field.init();
       field.setShip(ship);

        do {
            field.show();
            int shoot = player.getShoot();
            field.doShoot(shoot);
        } while (field.continueGame());

        field.show();

    }
}
