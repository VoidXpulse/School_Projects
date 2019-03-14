import java.io.*;
import java.util.Scanner;
//importing the things
public class Seven_One_Part_Two {
    //Justin Ecarma
    //3/12/2019
    //Lab 7.1 Part Two
    //
    public static void main(String[] args) {
        File payroll = new File("src/Payroll.txt");
        PrintWriter pw;
        //making the file
        //making the variables
        String employee = "";
        int number;
        Scanner theScanner = new Scanner(System.in);

        System.out.println("Enter the number of employees");
        number = theScanner.nextInt();
        //getting the number of employees
        //looping for user input
        for(int i = 0; i < number; i++)
        {
            System.out.println("Enter the employee's full name");
            employee = employee + theScanner.next() + " ";

            System.out.println("Enter their hourly wage");
            employee = employee + theScanner.next() + " ";

            System.out.println("Enter the number of hours they worked this week");
            employee = employee + theScanner.next() + " ";
        }
        try
        {
            pw = new PrintWriter(payroll);
            pw.println(employee);
            pw.close();
            //writing input to the file and closing the file
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            //error result
        }
    }
}
