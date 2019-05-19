public class Eight_Fifteen {
    //Justin Ecarma
    //5/7/2019
    //Lab 8.15
    //Extra: Prints out the coordinates where death is.
    public static void main(String[] args) {
        int sum = 0;
        int map[][] = {{5, 1, 3, 1, 2, 4, 2, 1}, {2, 4, 0, 3, 1, 4, 3, 2}, {6, 1, 5, 2, 1, 5, 4, 1}, {2, 3, 4, 1, 2, 2, 1, 0}, {4, 1, 4, 2, 6, 4, 2, 3}, {1, 3, 3, 3, 4, 1, 5, 2}};
        boolean deadly[][] = new boolean[6][8];

        //declarng and initializing the variables

        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                if(i == 0 || j == 0) {
                    continue;
                }
                if(i == map.length - 1 || j == map[i].length - 1) {
                    continue;
                }
                sum = map[i][j] + map[i + 1][j] + map[i - 1][j] + map[i][j + 1] + map[i][j - 1];

                if(sum > 15) {
                    deadly[i][j] = true;
                }
                else {
                    deadly[i][j] = false;
                }
                sum = 0;
            }
        }
        //deciding what to skip, what to check, and what is deadly

        for(int i = 0; i < map.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
                System.out.print(" | ");
            }
            System.out.println("");
        }
        //printing the map normally

        System.out.println("");
        for(int i = 0; i < map.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < map[i].length; j++) {
                if(deadly[i][j]) {
                    System.out.print("D");
                }
                else {
                    System.out.print(" ");
                }
                System.out.print(" | ");
            }
            System.out.println("");
        }
        //printing the deadly map

        //printing the extra
        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(deadly[i][j]) {
                    System.out.println("Death at (" + i + "," + j + ").");
                }
            }
        }
    }
}
