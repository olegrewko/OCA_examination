package IgorDolgov;

import java.util.Scanner;


public class PlayerXOX {
    public static byte moveCounter = 1; //счетчик хода. крестики ходят по четному счетчику
    public byte getMoveCounter () {
        return moveCounter;
    }
    public char[][] update (char FIELD[][]) {
        if (moveCounter % 2 == 0) {
            System.out.println("\nХод X #" + moveCounter + " Введите координаты хода [x]пробел[y]=[0,1,2]пробел[0,1,2]: ");
        } else {
            System.out.println("\nХод O #" + moveCounter + " Введите координаты хода [x]пробел[y]=[0,1,2]пробел[0,1,2]: ");
        }
        Scanner scannerOfPlayerMove = new Scanner(System.in);
        int y = scannerOfPlayerMove.nextInt();
        int x = scannerOfPlayerMove.nextInt();
        if (FIELD[x][y] == '.') {
            if ((moveCounter % 2 == 0) && (FIELD[x][y] != 'x') && (FIELD[x][y] != 'o')) {
                FIELD[x][y] = 'x';
                moveCounter++;
            } else {
                FIELD[x][y] = 'o';
                moveCounter++;
            }
        } else {
            System.out.println("\nКлетка занята,попробуйте снова ");
        }
        return FIELD;
    }
}
