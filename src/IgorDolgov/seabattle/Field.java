package IgorDolgov.seabattle;

public class Field {
    char[] cells = new char[10];
    Ship ship;
    void show(){
        System.out.println(cells);
    }
    void init(){
        for (int i = 0; i < cells.length ; i++) {
           cells[i] = '.';
        }
    }
    void doShoot(int shoot) {
        switch (cells[shoot]) {
            case '.':
                System.out.println("Промах");
                cells[shoot] = '*';
                break;
            case 'X':
                System.out.println("Потопили");
                cells[shoot] = '#';
                break;
            case '*':
                System.out.println("Уже стреляли");
                break;
        }
    }
    boolean continueGame(){
    return cells[ship.position] == 'X';
    }
    void setShip(Ship ship){
        this.ship = ship;
        cells[ship.position] = 'X';
    }
}
