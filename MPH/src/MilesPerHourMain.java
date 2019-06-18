import java.util.Scanner;
//importing the Scanner
public class MilesPerHourMain {
    //Justin Ecarma
    //6/16/2019
    //MPH Lab
    //Extra: The user can choose to continue the loop
    public static void main(String[] args) {
        int dist, hrs, mins, go = 1;
        //declaring the variables and declaring go
        Scanner theScanner = new Scanner(System.in);
        //making the Scanner
        do{
            System.out.println("Enter the distance: ");
            dist = theScanner.nextInt();
            System.out.println("Enter the hours: ");
            hrs = theScanner.nextInt();
            System.out.println("Enter the minutes: ");
            mins = theScanner.nextInt();
            //getting input
            MilesPerHour MPH = new MilesPerHour(dist, hrs ,mins);
            //making the object(automatically runs the required methods)
            System.out.println("\n \n \n");
            //line break
            System.out.println("Would you like to do another calculation?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            go = theScanner.nextInt();
            //getting input to choose whether to continue the loop or not.
        }
        while(go == 1);
        //the loop
    }
}
