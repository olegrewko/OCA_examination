package IgorDolgov;

public class MainXOX {
    static boolean gameFinished = false;
    static final char[][] FIELD = new char[][]{

            {'.', '.', '.'},
            {'.', '.', '.'},
            {'.', '.', '.'}
    };

    public static void main (String[] args) {
        System.out.println("Игровое поле");
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD.length; j++) {
                System.out.print(FIELD[i][j] + "    ");
            }
            System.out.println();
        }

        PlayerXOX playerGame = new PlayerXOX();
        byte moveOfPlayers = 1;
        while (gameFinished == false) {//пока игра не закончилась - играем
            playerGame.update(FIELD);
            moveOfPlayers = playerGame.getMoveCounter();
            if (moveOfPlayers > 9) {
                gameFinished = true;
            }//ходов больше нет - ничья
            for (int i = 0; i < FIELD.length; i++) {
                for (int j = 0; j < FIELD[i].length; j++) {
                    if (moveOfPlayers > 5) {//до победы надо минимум 5 ходов. нет смысла проверять раньше
                        if ((FIELD[0][0] == FIELD[0][1]) && (FIELD[0][1] == FIELD[0][2]) && (FIELD[0][0] != '.')) {
                            gameFinished = true;
                        }
                        if ((FIELD[1][0] == FIELD[1][1]) && (FIELD[1][1] == FIELD[1][2]) && (FIELD[1][1] != '.')) {
                            gameFinished = true;
                        }
                        if ((FIELD[2][0] == FIELD[2][1]) && (FIELD[2][1] == FIELD[2][2]) && (FIELD[2][2] != '.')) {
                            gameFinished = true;
                        } //проверка на победу по горизонтали

                        if ((FIELD[0][0] == FIELD[1][0]) && (FIELD[1][0] == FIELD[2][0]) && (FIELD[0][0] != '.')) {
                            gameFinished = true;
                        }
                        if ((FIELD[0][1] == FIELD[1][1]) && (FIELD[1][1] == FIELD[2][1]) && (FIELD[1][1] != '.')) {
                            gameFinished = true;
                        }
                        if ((FIELD[0][2] == FIELD[1][2]) && (FIELD[1][2] == FIELD[2][2]) && (FIELD[2][2] != '.')) {
                            gameFinished = true;
                        }//проверка на победу по вертикали

                        if ((FIELD[0][0] == FIELD[1][1]) && (FIELD[1][1] == FIELD[2][2]) && (FIELD[2][2] != '.')) {
                            gameFinished = true;
                        }
                        if ((FIELD[0][2] == FIELD[1][1]) && (FIELD[1][1] == FIELD[2][0]) && (FIELD[2][0] != '.')) {
                            gameFinished = true;
                        }//проверка на победу по диагонали
                    }

                    System.out.print(FIELD[i][j] + "\t");//вывод элемента+отступ
                }
                System.out.println();//переход на новую строку для создания сетки игры
            }
        }

        if (gameFinished) {
            if (moveOfPlayers < 9) {
                if (moveOfPlayers % 2 == 0) {
                    System.out.println("\nНолики выйграли, поздравляем!");
                } else {
                    System.out.println("\nКрестики выйграли, поздравляем!");
                }
            } else {
                System.out.println("\nНичья!");
            }
            System.out.println("Конец игры!");
        }
    }
}

