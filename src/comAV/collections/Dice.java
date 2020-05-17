package comAV.collections;

import java.security.SecureRandom;

public class Dice {

    public static void main(String[] args) {
        SecureRandom random  = new SecureRandom();
        int[] frequency = new int[7];
        for (int i =0; i<1000; i++){
            ++frequency[1+random.nextInt(6)];
        }

        for (int i =1; i<frequency.length; i++){
            System.out.println("Side "+i+": "+frequency[i]);
        }

        multiformArray();

    }


    public static void multiformArray (){
//    arr[0][0], arr[0][1], arr[0][2]
//    arr[1][0], arr[1][1], arr[1][2]
//    arr[2][0], arr[2][1], arr[2][2]


        int [][] arr = {{1,2},
                {3,4,5,6}, {77,8,9,9}};
//        int [][] array = new int [3][4];
//        int [][] array2 = new int [3][];
//        array2[0] = new int[2];
//        array2[1] = new int[4];

        for(int i =0; i<arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

    }
}
