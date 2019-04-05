import java.text.DecimalFormat;
import java.util.Scanner;

public class Eight_Two_Part_One {
    //Justin Ecarma
    //4/4/2019
    //Lab 8.2
    //Extra:
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        int numbers;
        double sum = 0, perkent;
        DecimalFormat decaFor = new DecimalFormat("0.#");
        DecimalFormat decaFor2 = new DecimalFormat("0");
        System.out.println("How many numbers do you want to enter?");
        numbers = theScanner.nextInt();
        double usernums[] = new double[numbers];
        System.out.println("Please enter the " + numbers + " numbers.");
        for(int i = 0; i < usernums.length; ++ i) {
            usernums[i] = theScanner.nextInt();
            sum += usernums[i];
        }

        System.out.println("The sum is " + decaFor2.format(sum) + ".");
        System.out.println("Statistics");
        for(double y:usernums) {
            perkent = (y / sum) * 100;
            System.out.print(decaFor2.format(y) + " is " + decaFor.format(perkent) + "% of the sum");
            if(y % 2 == 0) {
                System.out.println(" and is also even.");
            }
            else {
                System.out.println(" and is also odd.");
            }
        }

    }
}
