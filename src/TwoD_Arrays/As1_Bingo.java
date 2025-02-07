package TwoD_Arrays;

import Utilities.Library;

public class As1_Bingo {

    public static void run(){

        char[] Titles = { 'B','I','N','G','O'};
        int num;


        int[][] BingoCard = {

                generateArray(5, 1, 15),
                generateArray(5, 16, 30),
                generateArray(5, 31, 45),
                generateArray(5, 46, 60),
                generateArray(5, 61, 75),
        };


        printBingo(BingoCard, Titles);
        while(true){

           String intput = Library.input.nextLine();
           if ( intput == ""){
               System.out.println();
               boolean isthere = false;

               num =  Library.myRandom(1,75);

               for (int i = 0; i < BingoCard.length; i++) {
                   for (int j = 0; j < BingoCard.length; j++) {
                       if(BingoCard[i][j] == num){
                           isthere = true;
                           System.out.println("Found");

                           if(isthere == true){
                               BingoCard[i][j]*= -1;
                           }
                       }

                   }

               }


               if(isthere == false){
                   System.out.println("Not Found");
               }
               printBingo(BingoCard, Titles);
               System.out.println( "The number chosen is: " + num);

               CheckWin(BingoCard);



           }
        if(CheckWin(BingoCard) == true){
            break;
        }

        }
    }//run
    public static void printBingo(int[][] grid, char[] Titles) {
        for (int row = 0; row < 5; row++) {
            System.out.print(Titles[row] + " ");
            for (int col = 0; col < 5; col++) {
                if (   grid[row][col] == 0  ) {
                    System.out.print(" ");
                }else{
                    System.out.print(grid[row][col] + "  ");
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


    public static boolean CheckWin(int[][] arr){
        boolean iswin = false;

        for (int i = 0; i < arr.length; i++) {
                if(arr[0][i] < 0 && arr[1][i] < 0 && arr[2][i] < 0 && arr[3][i]< 0 && arr[4][i] < 0){
                    iswin = true;
                    System.out.println("you Win");
                }
                else if(arr[i][0] < 0 && arr[i][1]< 0  && arr[i][2] < 0 && arr[i][3] < 0 && arr[i][4] < 0){
                    iswin = true;
                System.out.println("you Win");
            }

        }


        return iswin;
    };







}//class
