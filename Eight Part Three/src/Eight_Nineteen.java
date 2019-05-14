public class Eight_Nineteen {
    //Justin Ecarma
    //5/14/2019
    //Lab 8.19
    //
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        welcome();
        for(int i = 0; i < 9; i++){
            showBoard(board);
            if(i % 2 == 0) {
                System.out.println("Player One");
            }
            else{
                System.out.println("Player Two");
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
                System.out.print(board[i][j]);
                System.out.print(" |");
            }
            System.out.println("");
            System.out.println(" - - - ");
        }
    }
}
