import java.util.Scanner;

public class Eight_Two_Part_One {
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        int numbers;
        double sum = 0, perkent;

        System.out.println("How many numbers do you want to enter?");
        numbers = theScanner.nextInt();
        double usernums[] = new double[numbers];
        System.out.println("Please enter the " + numbers + " numbers.");
        for(double i:usernums) {
            i = theScanner.nextInt();
            sum += i;
        }

        System.out.println("The sum is " + sum + ".");
        System.out.println("Statistics");

        for(double y:usernums) {
            perkent = y / sum;
            System.out.println(y + " is " + perkent + "% of the sum");
        }

    }
}
