package IgorDolgov.fortBoyard;

import java.util.Arrays;
public class Dz {
    public static char[][] cells;
    public static void main(String[] args) {
        // свободные ячейки обозначим знаком ?
        cells = new char[][]{{'?', '?', '?'}, {'?', '?', '?'}, {'?', '?', '?'}};
        generateRandomXO();
        // выведем на экран
        System.out.println(Arrays.deepToString(cells));
    }
    private static void generateRandomXO() {
        int rowRnd;
        int colRnd;
        do {
            // определили случайные координаты
            rowRnd = (int) (Math.random() * 3);
            colRnd = (int) (Math.random() * 3);
        } while (cells[rowRnd][colRnd] != '?'); // продолжать пока не найдем свободную ячейку
        cells[rowRnd][colRnd] = 'X';
    }

}
