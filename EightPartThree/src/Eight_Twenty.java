import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Eight_Twenty {
    //Justin Ecarma
    //5/16/2019
    //Lab 8.20
    //Extra: The winning number is randomized
    public static void main(String[] args) {
        File firstname = new File("EightPartThree/src/firstname.txt");
        File firstnum = new File("EightPartThree/src/firstnum.txt");
        File lastname = new File("EightPartThree/src/lastname.txt");
        File lastnum = new File("EightPartThree/src/lastnum.txt");

        String[] fn = new String[25];
        int[] fnu = new int[25];
        String[] ln = new String[25];
        int[] lnu = new int[25];

        Random rando = new Random();

        int win = rando.nextInt(100) + 1, winner = 0;
        //getting random win number
        boolean wincond = false;

        //declaring and initializing variables, and opening files

        //try catch loop for errors
        try{
            Scanner theScanner = new Scanner(firstname);
            Scanner theScanner1 = new Scanner(firstnum);
            Scanner theScanner2 = new Scanner(lastname);
            Scanner theScanner3 = new Scanner(lastnum);

            //creating Scanners

            for(int i = 0; i < fn.length; i++) {
                fn[i] = theScanner.next();
            }

            for(int i = 0; i < fnu.length; i++) {
                fnu[i] = theScanner1.nextInt();
            }

            for(int i = 0; i < ln.length; i++) {
                ln[i] = theScanner2.next();
            }

            for(int i = 0; i < lnu.length; i++) {
                lnu[i] = theScanner3.nextInt();
            }

            alphabetic(fn, fnu);
            alphabetic(ln, lnu);
            //alphabetic sort for arrays

            for(int i = 0; i < fn.length; i++) {
                System.out.print(fn[i] + " ");
                System.out.print(ln[i] + " ");
                System.out.print(fnu[i] + " ");
                System.out.print(lnu[i] + " ");
                System.out.println(" ");
            }

            for(int i = 0; i < fn.length; i++) {
                if(win == fnu[i]) {
                    wincond = true;
                    winner = i;
                }
                if(win == lnu[i]) {
                    wincond = true;
                    winner = i;
                }
            }

            //printing result
            if(wincond) {
                System.out.println("The winner is " + fn[winner] + " " + ln[winner] + ", number " + fnu[winner] + ".");
            }
            else {
                System.out.println("No winner here, but the winning number is " + win);
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    //alphabet sort method
    public static void alphabetic(String[] words, int[] numbers) {
        String temp;
        int temp1;
        boolean flag = true;
        while(flag){
            flag = false;

            for(int i = 0; i < words.length - 1; i++) {
                if((words[i].compareToIgnoreCase(words[i+1])) > 0) {

                    temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;

                    temp1 = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp1;

                    flag = true;
                }
            }
        }
    }
}
