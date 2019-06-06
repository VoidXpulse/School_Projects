import java.util.Scanner;

public class Eight_One_Part_Three {
    /*
   Justin Ecarma
   4/1/2019
   Lab 8.1 Part 2
    Extra: User can enter the number of ages they want to enter
   */
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        int[] ages = new int[20];
        int count = 0, num;
        System.out.println("Enter the number of ages you want to enter.");
        num = theScanner.nextInt();
        for(int y = 0; y < num; y++)
        {
            System.out.println("Enter an age");
            ages[y] = theScanner.nextInt();
        }

        for(int x:ages)
        {
            if(x > 15){
                count++;
            }
        }
        System.out.println("The number of ages above 15 is " + count);
    }
}
