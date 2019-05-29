import java.util.Random;
import java.util.Scanner;

public class Eight_Nineteen {
    //Justin Ecarma
    //5/14/2019
    //Lab 8.19
    //Extra: CPU player
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        Random rando = new Random();
        int x = 0, y = 0, p2 = 0;
        welcome();
        System.out.println("Would you like to play against another person, or a CPU?");
        System.out.println("1. Person");
        System.out.println("2. CPU");
        p2 = theScanner.nextInt();

        if (p2 > 1) {
            for (int i = 0; i < 9; i++) {
                showBoard(board);
                if (winCheck(board, 'O')) {
                    System.out.println("Player 1 Wins");
                    break;
                }
                if (winCheck(board, 'X')) {
                    System.out.println("Player 2 Wins");
                    break;
                }
                if (i % 2 == 0) {
                    System.out.println("Player One");
                    while (1 < 2) {
                        System.out.println("What row would you like to put your symbol in?");
                        x = theScanner.nextInt() - 1;

                        System.out.println("What column would you like to put your symbol in?");
                        y = theScanner.nextInt() - 1;
                        if (x < 0) {
                            System.out.println("Spot taken or outside of grid.");
                            continue;
                        }
                        if (x > 3) {
                            System.out.println("Spot taken or outside of grid.");
                            continue;
                        }
                        if (y < 0) {
                            System.out.println("Spot taken or outside of grid.");
                            continue;
                        }
                        if (y > 3) {
                            System.out.println("Spot taken or outside of grid.");
                            continue;
                        }
                        if (board[x][y] == 'X' || board[x][y] == 'O') {
                            System.out.println("Spot taken or outside of grid.");
                            continue;
                        }
                        break;
                    }
                    board[x][y] = 'O';
                } else {
                    System.out.println("Player Two");
                    while (1 < 2) {

                        x = rando.nextInt(3);


                        y = rando.nextInt(3);
                        if (x < 0) {
                            continue;
                        }
                        if (x > 3) {
                            continue;
                        }
                        if (y < 0) {
                            continue;
                        }
                        if (y > 3) {
                            continue;
                        }
                        if (board[x][y] == 'X' || board[x][y] == 'O') {
                            continue;
                        }
                        break;
                    }
                    board[x][y] = 'X';
                }
            }
        } else {
            for (int i = 0; i < 9; i++) {
                showBoard(board);
                if (winCheck(board, 'O')) {
                    System.out.println("Player 1 Wins");
                    break;
                }
                if (winCheck(board, 'X')) {
                    System.out.println("Player 2 Wins");
                    break;
                }
                if (i % 2 == 0) {
                    System.out.println("Player One");
                    while (1 < 2) {
                        System.out.println("What row would you like to put your symbol in?");
                        x = theScanner.nextInt() - 1;

                        System.out.println("What column would you like to put your symbol in?");
                        y = theScanner.nextInt() - 1;
                        if (x < 0) {
                            System.out.println("Spot taken or outside of grid.");
                            continue;
                        }
                        if (x > 3) {
                            System.out.println("Spot taken or outside of grid.");
                            continue;
                        }
                        if (y < 0) {
                            System.out.println("Spot taken or outside of grid.");
                            continue;
                        }
                        if (y > 3) {
                            System.out.println("Spot taken or outside of grid.");
                            continue;
                        }
                        if (board[x][y] == 'X' || board[x][y] == 'O') {
                            System.out.println("Spot taken or outside of grid.");
                            continue;
                        }
                        break;
                    }
                    board[x][y] = 'O';
                } else {
                    System.out.println("Player Two");
                    while (1 < 2) {
                        System.out.println("What row would you like to put your symbol in?");
                        x = theScanner.nextInt() - 1;

                        System.out.println("What column would you like to put your symbol in?");
                        y = theScanner.nextInt() - 1;
                        if (x < 0) {
                            System.out.println("Spot taken or outside of grid.");
                            continue;
                        }
                        if (x > 3) {
                            System.out.println("Spot taken or outside of grid.");
                            continue;
                        }
                        if (y < 0) {
                            System.out.println("Spot taken or outside of grid.");
                            continue;
                        }
                        if (y > 3) {
                            System.out.println("Spot taken or outside of grid.");
                            continue;
                        }
                        if (board[x][y] == 'X' || board[x][y] == 'O') {
                            System.out.println("Spot taken or outside of grid.");
                            continue;
                        }
                        break;
                    }
                    board[x][y] = 'X';
                }
            }
        }
    }
        public static void welcome () {
            System.out.println("Tic-tac-toe is played on a square grid\n" +
                    "which has three rows and three\n" +
                    "columns. The two players take turns\n" +
                    "entering either an X or an O into the\n" +
                    "grid. The player that manages to get their\n" +
                    "three symbols in a line wins.");
            System.out.println();
        }
        public static void showBoard ( char[][] board){
            System.out.println(" _ _ _ ");
            for (int i = 0; i < board.length; i++) {
                System.out.print("|");
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == 'O') {
                        System.out.print("O|");
                    } else if (board[i][j] == 'X') {
                        System.out.print("X|");
                    } else {
                        System.out.print(" |");
                    }
                }
                System.out.println();
                System.out.println(" - - - ");
            }
        }
    public static boolean winCheck ( char[][] magic, char check){
        boolean fail = false;

        if (magic[0][0] == check && magic[0][1] == check && magic[0][2] == check) {
            fail = true;
        } else if (magic[1][0] == check && magic[1][1] == check && magic[1][2] == check) {
            fail = true;
        } else if (magic[2][0] == check && magic[2][1] == check && magic[2][2] == check) {
            fail = true;
        } else if (magic[0][0] == check && magic[1][0] == check && magic[2][0] == check) {
            fail = true;
        } else if (magic[0][1] == check && magic[1][1] == check && magic[2][1] == check) {
            fail = true;
        } else if (magic[0][2] == check && magic[1][2] == check && magic[2][2] == check) {
            fail = true;
        } else if (magic[0][0] == check && magic[1][1] == check && magic[2][2] == check) {
            fail = true;
        } else if (fail = magic[2][0] == check && magic[1][1] == check && magic[0][3] == check) {
            fail = true;
        }
        else {

        }
        return fail;
    }
}
