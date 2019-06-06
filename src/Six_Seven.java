import java.util.Random;
import java.util.Scanner;

public class Six_Seven {
    //Justin Ecarma
    //3/6/2019
    //Lab 6.7
    //Extra: Yoda makes the ship launch after 20 runs, but Vader has a chance to stop the launch after 15 runs. 
    public static void main(String[] args) {
        int run = 1, launch = 0;
        Random rando = new Random();
        String start;
        Scanner theScanner = new Scanner(System.in);
        //Declaring the ints
        System.out.println("***************************************");
        System.out.println("* Millennium Falcon Launch Simulation *");
        System.out.println("*    System Navigator: Ecaju Ehfla    *");
        System.out.println("***************************************");
        //title
        do {
            System.out.println("Enter G to start launch");
            start = theScanner.next();
            //error trapping the start key
        }
        while(!(start.equalsIgnoreCase("G")) || !(start.equalsIgnoreCase("g")));
        System.out.println("       R2  C3  Han  Luke  Chewie  Leia");
        //starting the grid
        do {
            //looping through many iterations in order to see if the ship will launch
            launch = 0;
            //reseting if loop fails
            System.out.println();
            System.out.print("Run " + run);
            //checking if the crew member suceeds or fails. 
            if (R2()) {
                System.out.print("  Go");
                launch++;
            } else {
                System.out.print("  No");
            }

            if (C3()) {
                System.out.print("  Go");
                launch++;
            } else {
                System.out.print("  No");
            }

            if (Han()) {
                System.out.print("  Go");
                launch++;
            } else {
                System.out.print("  No");
            }

            if (Luke()) {
                System.out.print("   Go");
                launch++;
            } else {
                System.out.print("   No");
            }

            if (Chewie()) {
                System.out.print("    Go");
                launch++;
            } else {
                System.out.print("    No");
            }

            if(Leia()) {
                System.out.print("      Go");
                launch++;
            } else {
                System.out.print("      No");
            }

            if(run >= 20) {
                System.out.println();
                System.out.println("Yoda used The Force to launch the ship!");
                launch =+ 6;
            }
            //EXTRA bits: Yoda will launch the ship if run count is over 20
            //Vader will stop the shiip if the run count is over 15, the ship can launch, and if Vader reaches a certain efficiency of his own
            if((run >= 15) && (launch >= 6) && (Vader())) {
                System.out.println();
                System.out.println("Darth Vader stopped the ship from launching using The Force!");
                launch = 0;
            }
            //adding to the run counter
            run++;
        }
            while(!(launch >= 6));
            System.out.println();
            System.out.println("WE ARE GO FOR LAUNCH!");
            //ending the program
        }
        //basically the same method, but with different numbers for succeed, i.e., R2 is 40, C3PO is 50, etc.
        public static boolean R2() {
            Random rando = new Random();
            return rando.nextInt(101) >= 40;
        }
        public static boolean C3() {
            Random rando = new Random();
            return rando.nextInt(101) >= 50;
        }
        public static boolean Han() {
            Random rando = new Random();
            return rando.nextInt(101) >= 30;
        }
        public static boolean Luke() {
            Random rando = new Random();
            return rando.nextInt(101) >= 20;
        }
        public static boolean Chewie() {
            Random rando = new Random();
            return rando.nextInt(101) >= 35;
        }
        public static boolean Leia() {
            Random rando = new Random();
            return rando.nextInt(101) >= 45;
    }
        public static boolean Vader() {
            Random rando = new Random();
            return rando.nextInt(101) >= 66;
        }
}
