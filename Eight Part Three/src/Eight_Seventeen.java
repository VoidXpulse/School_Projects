import java.util.Scanner;

public class Eight_Seventeen {
    //Justin Ecarma
    //5/13/2019
    //Lab 8.17
    //
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        int woot = 0;
        int howmany = 0;
        int[] numbers = {26, 19, 45, 22, 79, 35, 21, 4, 76, 45, 56, 90, 88, 32, 45, 3, 66, 74, 77, 35, 24, 33, 42, 55, 76, 74, 88, 90};
        System.out.println("Would you like to make your own array?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        woot = theScanner.nextInt();
        if(woot == 1) {
            System.out.println("Enter your numbers.");
            for(int i = 0; i < numbers.length; i++) {
                theScanner.nextInt();
            }
        }
        int[] asterisk = new int[10];
        for(int i = 0; i < asterisk.length; i++){
            asterisk[i] = 0;
        }
        for (int y:numbers) {
            if ((y >= 0) && (y <= 9)) {
                asterisk[0]++;
            } else if ((y >= 10) && (y <= 19)) {
                asterisk[1]++;
            } else if ((y >= 20) && (y <= 29)) {
                asterisk[2]++;
            } else if ((y >= 30) && (y <= 39)) {
                asterisk[3]++;
            } else if ((y >= 40) && (y <= 49)) {
                asterisk[4]++;
            } else if ((y >= 50) && (y <= 59)) {
                asterisk[5]++;
            } else if ((y >= 60) && (y <= 69)) {
                asterisk[6]++;
            } else if ((y >= 70) && (y <= 79)) {
                asterisk[7]++;
            } else if ((y >= 80) && (y <= 89)) {
                asterisk[8]++;
            } else if ((y >= 90) && (y <= 100)) {
                asterisk[9]++;
            } else {
                continue;
            }
        }
        for(int i = 0; i < asterisk.length; i++){
            if(asterisk[i] > 0){
                for(int g = 0; g < asterisk[i]; g++){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
