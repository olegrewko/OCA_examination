package IgorDolgov;

public class Test6MultArray {
//    static void pause(int delay){
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
    //------------------------------------------
    char player1 = 'X';
    char player2 = 'O';
    int currentPlayer;
    public static void main(String[] args) {
        char[][] cells;
        cells = new char [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[j][i] = '.';

            }
        }
//        cells[0][0] = 'X';
//        cells[0][1] = 'X';
//        cells[0][2] = 'X';
//        cells[0][0] = 'X';
//        cells[1][0] = 'X';
//        cells[2][0] = 'X';
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3 ; column++) {
                System.out.print(cells[column][row] + " ");
            }
//            System.out.println(1>2);
        }

//        pause(1000);
    }
}
