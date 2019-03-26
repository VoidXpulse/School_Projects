import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//importing the stuff
public class Seven_Five_Part_One {
    public static void main(String[] args) {
        File data = new File("Seven/src/ScoreData.txt");
        int count = 0, mean = 0, sumsd = 0;
        //connecting to the file
        try
        {
            //making the scanner
            Scanner theScanner = new Scanner(data);
            do
            {
                if(theScanner.hasNextInt())
                {
                    mean =+ theScanner.nextInt();
                    count++;
                }
            }
            while(!(theScanner.hasNextInt()));
            mean = mean / count;
            System.out.println(mean);
            theScanner.close();
        }
        catch(FileNotFoundException e) {
            //error result
            System.out.println(e.getMessage());
        }

        try
        {
            //making the scanner
            Scanner theScanner = new Scanner(data);
            do {
                sumsd = theScanner.nextInt() - mean;
            }
            while(!(theScanner.hasNextInt()));
            theScanner.close();
        }
        catch(FileNotFoundException e) {
            //error result
            System.out.println(e.getMessage());
        }
    }
}
