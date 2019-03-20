import java.io.*;
import java.util.Scanner;

public class Seven_Two_Part_Two {
    //Justin Ecarma
    //3/14/2019
    //Lab 7.2 Part 2
    //
    public static void main(String[] args) {
        File payroll = new File("src/payroll.txt");
        String fromfile;
        int one, two, gross;
        try
        {
            //making the scanner
            Scanner theScanner = new Scanner(payroll);
            while(1<2)
            {
                System.out.println("Name: " + theScanner.next());
                one = theScanner.nextInt();
                System.out.println("Hourly Wage: $" + one);
                two = theScanner.nextInt();
                System.out.println("Number of Hours Worked: " + two);
                gross = one * two;
                System.out.println("Gross Pay: $" + gross);
                System.out.println("");
                if(!theScanner.hasNext())
                {
                    break;
                }
            }
            //printing the things
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            //error result
        }

    }
}
