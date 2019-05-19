import java.util.Scanner;

public class Eight_Thirteen {
    //Justin Ecarma
    //5/2/2019
    //Lab 8.13
    //Extra: User can make their own square
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        int x = 0;
        int magic[][] = {{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}};
        int model = 0;
        //declaring and initializing variables

        System.out.println("Would you like to do a premade array or make one yourself?");
        System.out.println("1. Premade");
        System.out.println("2. Original");
        //deciding whether premade or new magic square should be used

        model = theScanner.nextInt();
        if(model <= 1) {
            if(check(magic)) {
                System.out.println("This square is indeed magic.");
            }
            else {
                System.out.println("This magic square is fake.");
            }
        }
        else {
            //making a new array
            System.out.println("What side length would you like?");
            x = theScanner.nextInt();
            int test[][] = new int[x][x];

            System.out.println("Enter your numbers");

            for (int i = 0; i < test.length; i++) {
                for (int j = 0; j < test.length; j++) {
                    test[i][j] = theScanner.nextInt();
                }
            }

            if(check(magic)) {
                System.out.println("This square is indeed magic.");
            }
            else {
                System.out.println("This magic square is fake.");
            }
            //saying whether the square is magic or not
        }
    }
    public static boolean check(int[][] magic) {
        int yeet = 0;
        int tempsum = 0;
        boolean fail = true;
        //getting the variables

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
        return fail;
        //if return is set to false, the square has failed 1 or more of the tests
    }
}
