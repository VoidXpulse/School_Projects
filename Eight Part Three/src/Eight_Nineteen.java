import java.util.Scanner;

public class Eight_Nineteen {
    //Justin Ecarma
    //5/14/2019
    //Lab 8.19
    //
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        int x = 0, y = 0;

        welcome();

        for(int i = 0; i < 9; i++){
            showBoard(board);
            if(winCheck(board, i)) {
                if(i % 2 == 0) {
                    System.out.println("Player 1 Wins!");
                    break;
                }
                else {
                    System.out.println("Player 2 Wins!");
                    break;
                }
            }
            if(i % 2 == 0) {
                System.out.println("Player One");
                while(1 < 2) {
                    System.out.println("What row would you like to put your symbol in?");
                    x = theScanner.nextInt() - 1;

                    System.out.println("What column would you like to put your symbol in?");
                    y = theScanner.nextInt() - 1;
                    if(board[x][y] == 'X' || board[x][y] == 'O') {
                        System.out.println("Spot taken or outside of grid.");
                        continue;
                    }
                    else if(x < 0) {
                        System.out.println("Spot taken or outside of grid.");
                        continue;
                    }
                    else if(x > 3) {
                        System.out.println("Spot taken or outside of grid.");
                        continue;
                    }
                    else if(y < 0) {
                        System.out.println("Spot taken or outside of grid.");
                        continue;
                    }
                    else if(y > 3) {
                        System.out.println("Spot taken or outside of grid.");
                        continue;
                    }
                    else {
                        break;
                    }
                }
                board[x][y] = 'O';
            }
            else{
                System.out.println("Player Two");
                while(1 < 2) {
                    System.out.println("What row would you like to put your symbol in?");
                    x = theScanner.nextInt() - 1;

                    System.out.println("What column would you like to put your symbol in?");
                    y = theScanner.nextInt() - 1;
                    if(board[x][y] == 'X' || board[x][y] == 'O') {
                        System.out.println("Spot taken or outside of grid.");
                        continue;
                    }
                    else if(x < 0) {
                        System.out.println("Spot taken or outside of grid.");
                        continue;
                    }
                    else if(x > 3) {
                        System.out.println("Spot taken or outside of grid.");
                        continue;
                    }
                    else if(y < 0) {
                        System.out.println("Spot taken or outside of grid.");
                        continue;
                    }
                    else if(y > 3) {
                        System.out.println("Spot taken or outside of grid.");
                        continue;
                    }
                    else {
                        break;
                    }
                }
                board[x][y] = 'X';
            }
        }
    }
    public static void welcome() {
        System.out.println("Tic-tac-toe is played on a square grid\n" +
                "which has three rows and three\n" +
                "columns. The two players take turns\n" +
                "entering either an X or an O into the\n" +
                "grid. The player that manages to get their\n" +
                "three symbols in a line wins.");
        System.out.println("");
    }
    public static void showBoard(char[][] board) {
        System.out.println(" _ _ _ ");
        for(int i = 0; i < board.length; i++) {
            System.out.print("|");
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 'O') {
                    System.out.print("O|");
                }
                else if(board[i][j] == 'X') {
                    System.out.print("X|");
                }
                else {
                    System.out.print(" |");
                }
            }
            System.out.println("");
            System.out.println(" - - - ");
        }
    }
    public static boolean winCheck(char[][] magic, int g) {
        int yeet = 0;
        int tempsum = 0;
        char check;
        boolean fail = true;
        if(g % 2 == 0) {
            check = 'O';
        }
        else {
            check = 'X';
        }
        for(int i = 0; i < magic.length; i++) {
            if((magic[magic.length - i - 1][i] != check)) {
                fail = false;
            }
        }

        for(int i = 0; i < magic.length; i++) {
            for(int j = 0; j < magic[i].length; j++) {
                if((magic[i][j] != check)) {
                    fail = false;
                }
            }
        }
        for(int i = 0; i < magic.length; i++) {
            for(int j = 0; j < magic[i].length; j++) {
                if ((magic[j][i] != check)) {
                    fail = false;
                }
            }
        }
        for(int i = 0; i < magic.length; i++) {
            if((magic[i][i] != check)) {
                fail = false;
            }
        }
        tempsum = 0;
        for(int i = 0; i < magic.length; i++) {
            if((magic[i][magic.length - i - 1] != check)) {
                fail = false;
            }
        }
        return fail;
    }
}
