import java.io.*;
import java.util.Scanner;

public class Seven_Four_Part_Two {
    public static void main(String[] args) {
        File quiz = new File("Seven/src/quiz.txt");
        int score = 0;
        //connecting to the file
        try
        {
            //making the scanner
            Scanner theScanner = new Scanner(quiz);
            do{
                System.out.print(theScanner.next());
                if(theScanner.nextInt() == 3) {
                    score += 20;
                }
                if(theScanner.nextInt() == 4) {
                    score += 20;
                }
                if(theScanner.nextInt() == 2) {
                    score += 20;
                }
                if(theScanner.nextInt() == 3) {
                    score += 20;
                }
                if(theScanner.nextInt() == 1) {
                    score += 20;
                }
                System.out.println("'s score is " + score);
                score = 0;
            }
            while(theScanner.hasNext());
        }
        catch(FileNotFoundException e) {
            //error result
            System.out.println(e.getMessage());
        }
    }
}
