import java.io.*;
import java.util.Scanner;

public class Seven_Two_Part_Three {
    //Justin Ecarma
    //3/14/2019
    //Lab 7.2 Part 3
    //Extra: The average of
    public static void main(String[] args) {
        File numbers = new File("src/Numbers.txt");
        int number, sum = 0, average, iter = 0, odd = 0, even = 0, oddsum = 0, evensum = 0;
        try
        {
            //making the scanner
            Scanner theScanner = new Scanner(numbers);
            while(1 < 2) {
                number = theScanner.nextInt();
                System.out.println(number);
                sum = sum + number;
                iter++;
                if(number % 2 == 1)
                {
                    oddsum = oddsum + number;
                    odd++;
                }
                if(number % 2 == 0)
                {
                    evensum = evensum + number;
                    even++;
                }
                if(!theScanner.hasNext())
                {
                    break;
                }
            }
            average = sum / iter;
            System.out.println("There are " + even + " even numbers in the file");
            System.out.println("There are " + odd + " odd numbers in the file");
            System.out.println("The average of all the number is " + average);
        }
         catch(FileNotFoundException e)
         {
            System.out.println(e.getMessage());
            //error result
         }
    }
}
