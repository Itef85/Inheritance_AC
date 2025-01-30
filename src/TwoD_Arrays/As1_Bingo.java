package TwoD_Arrays;

import Utilities.Library;

public class As1_Bingo {

    public static void run(){

        char[] Titles = { 'B','I','N','G','O'};

        int[][] BingoCard = {
                generateArray(5, 1, 15),
                generateArray(5, 16, 30),
                generateArray(5, 31, 45),
                generateArray(5, 46, 60),
                generateArray(5, 61, 75),
        };


        printBingo(BingoCard);
    }//run
    public static void printBingo(int[][] grid) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (   grid[row][col] == 0  ) {
                    System.out.print("  ");
                }else{
                    System.out.print(grid[row][col] + " ");
                }
            } // col
            System.out.println();
        } // row
    }// printBingo


   public static int[] generateArray( int l, int minv, int maxv){
    int[] tempA = new int[l];

        for( int i = 0; i < tempA.length; i++){
            tempA[i] = Library.myRandom(minv, maxv);
       }
        return tempA;
   };


}//calss
