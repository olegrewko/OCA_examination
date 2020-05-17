package IgorDolgov;

import java.util.Scanner;

public class Xox {
    char player1 = 'X';
    char player2 = 'O';
    static int currentPlayer;
    static int x;
    static int y;
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        char[][] ch = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ch[j][i] = '.';
            }
        }
//        for (int row = 0; row < 3; row++) {
//            for (int column = 0; column < 3; column++) {
//                System.out.print(ch[column][row] + " ");
//            }
//            System.out.println();
//        }


            do {
                System.out.println("Введите символ игрока: Х/O ");
                String w = scanner.nextLine();
                System.out.println("Ход игрока " + w);
                System.out.println("Введите [0,1,2] [0,1,2] через пробел координаты по оси Х и Y");
                x = scanner.nextInt();
                y = scanner.nextInt();
//                Проверка
//                for (int i = 0; i < 3; i++) {
//                    for (int j = 0; j < 3; j++) {
//                      if((ch[x][y] == 'X')||(ch[x][y] == 'O')) {
//                          System.out.println("Ячейка занята введите другие координаты");
//                          continue;
//                      } else {
//                          ch[x][y] = 'X';
//                      }
//                    }
//                }
                char cw = w.charAt(0);
                ch[x][y] = cw;
                for (int row = 0; row < 3; row++) {
                    for (int column = 0; column < 3; column++) {
                        System.out.print(ch[column][row] + " ");
                    }
                    System.out.println("Ход игрока " + w);
                }

                System.out.println("Введите символ игрока: Х/О ");
                w = scanner.nextLine();
                System.out.println("Ход игрока " + w);
                System.out.println("Введите [0,1,2] [0,1,2] через пробел координаты по оси Х и Y");
                x = scanner.nextInt();
                y = scanner.nextInt();
                ch[x][y] = 'O';
                for (int row = 0; row < 3; row++) {
                    for (int column = 0; column < 3; column++) {
                        System.out.print(ch[column][row] + " ");
                    }
                    System.out.println("Ход игрока " + w);
                }
            } while (((ch[0][0] == 'O' && ch[0][1] == 'O' && ch[0][2] == 'O') || (ch[0][0] == 'X' && ch[0][1] == 'X' && ch[0][2] == 'X')) ||
                    ((ch[0][0] == 'O' && ch[1][0] == 'O' && ch[2][0] == 'O') || (ch[0][0] == 'X' && ch[1][0] == 'X' && ch[2][0] == 'X')) ||
                    ((ch[1][0] == 'O' && ch[1][1] == 'O' && ch[1][2] == 'O') || (ch[1][0] == 'X' && ch[1][1] == 'X' && ch[1][2] == 'X')) ||
                    ((ch[2][0] == 'O' && ch[2][1] == 'O' && ch[2][2] == 'O') || (ch[2][0] == 'X' && ch[2][1] == 'X' && ch[2][2] == 'X')) ||
                    ((ch[0][2] == 'O' && ch[1][2] == 'O' && ch[2][2] == 'O') || (ch[0][2] == 'X' && ch[1][2] == 'X' && ch[2][2] == 'X')) ||
                    ((ch[0][1] == 'O' && ch[1][1] == 'O' && ch[2][1] == 'O') || (ch[0][1] == 'X' && ch[1][1] == 'X' && ch[2][1] == 'X')) ||
                    ((ch[0][0] == 'O' && ch[1][1] == 'O' && ch[2][2] == 'O') || (ch[0][0] == 'X' && ch[1][1] == 'X' && ch[2][2] == 'X')) ||
                    ((ch[0][2] == 'O' && ch[1][1] == 'O' && ch[2][0] == 'O') || (ch[0][2] == 'X' && ch[1][1] == 'X' && ch[2][0] == 'X'))

            );


    }
}