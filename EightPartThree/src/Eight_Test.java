import java.util.Scanner;

public class Eight_Test {
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        char[][] board = {{'X', 'X', 'X'}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        int x = 0, y = 0;
        if (winCheck(board, 'X')) {
            System.out.println("Player 1 Wins!");
        } else {
            System.out.println("Fail");
        }
    }
    public static boolean winCheck(char[][] magic, char check) {
        boolean fail = false;

        if(magic[0][0] == check && magic[0][1] == check && magic[0][2] == check) {
            fail = true;
        }
        else if(magic[1][0] == check && magic[1][1] == check && magic[1][2] == check) {
            fail = true;
        }
        else if(magic[2][0] == check && magic[2][1] == check && magic[2][2] == check) {
            fail = true;
        }
        else if(magic[0][0] == check && magic[1][0] == check && magic[2][0] == check) {
            fail = true;
        }
        else if(magic[0][1] == check && magic[1][1] == check && magic[2][1] == check) {
            fail = true;
        }
        else if(magic[0][2] == check && magic[1][2] == check && magic[2][2] == check) {
            fail = true;
        }
        else if(magic[0][0] == check && magic[1][1] == check && magic[2][2] == check) {
            fail = true;
        }
        else fail = magic[2][0] == check && magic[1][1] == check && magic[0][3] == check;
        return fail;
    }
}

