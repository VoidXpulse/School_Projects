import java.util.Random;
import java.util.Scanner;
//importing the stuff

public class Eight_TwentyTwo {
    //Justin Ecarma
    //5/29/2019
    //Lab 8.22
    //Extra: The user can choose a random array
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        Random rando = new Random();
        int arraytype = 0, place, od = 0, neg = 0, ev = 0;
        int[] numbers = new int[10];
        //initializing and declaring the variables

        System.out.println("Would you like a random array or a enter a new one?");
        System.out.println("1. New");
        System.out.println("2. Random");
        arraytype = theScanner.nextInt();
        //choosing arraytype

        if(arraytype <= 1) {
            for(int i = 0; i < numbers.length; i++) {
                place = theScanner.nextInt();
                if(place != 0) {
                    numbers[i] = place;
                }
            }
        }
        else{
            for(int i = 0; i < numbers.length; i++) {
                numbers[i] = rando.nextInt();
            }
        }
        //making array

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) {
                neg++;
            }
            else{
                if(numbers[i] % 2 == 0){
                    ev++;
                }
                else{
                    od++;
                }
            }
        }
        //getting length of and creating new arrays
        int[] negative = new int[neg];
        int[] odd = new int[od];
        int[] even = new int[ev];
        neg = 0;
        od = 0;
        ev = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) {
                negative[neg] = numbers[i];
                neg++;
            }
            else{
                if(numbers[i] % 2 == 0){
                    even[ev] = numbers[i];
                    ev++;
                }
                else{
                    odd[od] = numbers[i];
                    od++;
                }
            }
        }
        //putting respective numbers into array

        System.out.println("Negative");
        for (int i = 0; i < negative.length; i++) {
            System.out.println(negative[i]);
        }
        System.out.println("");
        System.out.println("Even");
        for (int i = 0; i < even.length; i++) {
            System.out.println(even[i]);
        }
        System.out.println("");
        System.out.println("Odd");
        for (int i = 0; i < odd.length; i++) {
            System.out.println(odd[i]);
        }
        //output
    }
}
