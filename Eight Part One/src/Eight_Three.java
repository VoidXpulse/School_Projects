import java.util.Scanner;

public class Eight_Three {
    //Justin Ecarma
    //4/5/2019
    //Lab 8.3
    //Extra: The user will enter the number of numbers to enter.
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        int numbers, sum, average;
        System.out.println("How many numbers do you want to enter?");
        numbers = theScanner.nextInt();
        int[] usernums = new int[numbers];
        System.out.println("Please enter the " + numbers + " numbers.");
        for(int i = 0; i < usernums.length; ++ i) {
            usernums[i] = theScanner.nextInt();
        }
        System.out.println("The first number is " + usernums[0] + ".");
        System.out.println("The last number is " + usernums[usernums.length - 1] + ".");
        Print_It(usernums);
        average = Average(usernums);
        System.out.println("The average is " + average + ".");
    }
    public static void Print_It(int[] usernums) {
        for(int y:usernums) {
            System.out.println(y);
        }
    }
    public static int Average(int[] usernums) {
        int sum = 0, average;
        for(int x:usernums) {
            sum += x;
        }
        average = sum / 10;
        return average;
    }
}
