public class Eight_Thirteen {
    //Justin Ecarma
    //5/2/2019
    //Lab 8.13
    //
    public static void main(String[] args) {
        int magic[][] = {{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}};


        if(check(magic)) {
            System.out.println("This square is indeed magic.");
        }
        else {
            System.out.println("This magic square is fake.");
        }
    }
    public static boolean check(int[][] magic) {
        int yeet = 0;
        int tempsum = 0;
        boolean fail = true;
        for(int i = 0; i < magic.length; i++) {
            yeet += magic[magic.length - i - 1][i];
        }

        for(int i = 0; i < magic.length; i++) {
            for(int j = 0; j < magic[i].length; j++) {
                tempsum += magic[i][j];
            }
            if(tempsum != yeet) {
                fail = false;
            }
            tempsum = 0;
        }
        for(int i = 0; i < magic.length; i++) {
            for(int j = 0; j < magic[i].length; j++) {
                tempsum += magic[j][i];
            }
            if(tempsum != yeet) {
                fail = false;
            }
            tempsum = 0;
        }
        for(int i = 0; i < magic.length; i++) {
            tempsum += magic[i][i];
        }
        if(tempsum != yeet) {
            fail = false;
        }
        tempsum = 0;
        for(int i = 0; i < magic.length; i++) {
            tempsum += magic[magic.length - i - 1][i];
        }
        if(tempsum != yeet) {
            fail = false;
        }
    }
}
