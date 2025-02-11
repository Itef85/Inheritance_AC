package TwoD_Arrays;

import Utilities.Library;

public class As5_Vigenere {
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void run() {
        char[] keyWord = {'S', 'C', 'O', 'N', 'A'};
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[][] vigenere = createVSquare(alphabet);
        printSquare(vigenere);

        System.out.println("Press enter to decode");
        String intput = Library.input.nextLine();
        if (intput == "") {
            deCoder(vigenere, keyWord, alphabet);
        }

    }//run


    private static char[][] createVSquare(char[] alphabet) {
        char[][] square = new char[alphabet.length][alphabet.length];
        int addRow = 0;
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (j + addRow < 26) {
                    square[i][j] = alphabet[j + addRow];
                } else {
                    square[i][j] = alphabet[j + addRow - 26];
                }
            }
            addRow++;
        }
        return square;
    }//createVSquare


    public static void printSquare(char[][] square) {
        System.out.print("  ");
        for (int i = 0; i < square.length; i++) {
            System.out.print(ANSI_PURPLE + square[i][0] + ANSI_RESET + " ");
        }
        System.out.println();

        for (int i = 0; i < square.length; i++) {
            System.out.print(ANSI_PURPLE + square[i][0] + ANSI_RESET + " ");
            for (int j = 0; j < square.length; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }

    }//end printSquare

    public static int linearSearch(char[] arr, char searchTerm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchTerm) {
                return i;
            }
        }
        return -1;
    }

    public static char getChar(char[][] square, int rowNum, int colNum) {
        return square[rowNum][colNum];
    }

    public static void deCoder(char[][] vigenere, char[] keyWord, char[] alphabet) {
        System.out.println("what is the coded scentence?");
        String word = Library.input.nextLine().toUpperCase();
        int row ;
        int col ;

        StringBuilder sb = new StringBuilder();



    }







//    public static void deCoder(char[][] vigenere, char[] keyWord) {
//        System.out.println("Enter the coded message:");
//        String word = Library.input.nextLine().toUpperCase();
//
//        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
//        StringBuilder decodedMessage = new StringBuilder();
//
//        for (int i = 0; i < word.length(); i++) {
//            char encodedChar = word.charAt(i);
//            char keyChar = keyWord[i % keyWord.length];
//
//            int row = linearSearch(alphabet, keyChar); // Find key letter's row in Vigenère square
//            int col = linearSearch(vigenere[row], encodedChar); // Find encoded letter in that row
//
//            decodedMessage.append(alphabet[col]); // Convert to original letter
//        }
//
//        System.out.println("Decoded message: " + decodedMessage);
//    }






}//end class
