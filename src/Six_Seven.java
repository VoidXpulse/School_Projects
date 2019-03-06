import java.util.Random;
import java.util.Scanner;

public class Six_Seven {
    //Justin Ecarma
    //3/6/2019
    //Lab 6.7
    //
    public static void main(String[] args) {
        int run = 1, launch = 0;
        Random rando = new Random();
        String start;
        Scanner theScanner = new Scanner(System.in);
        System.out.println("***************************************");
        System.out.println("* Millennium Falcon Launch Simulation *");
        System.out.println("*    System Navigator: Ecaju Ehfla    *");
        System.out.println("***************************************");
        do {
            System.out.println("Enter G to start launch");
            start = theScanner.next();
        }
        while(!(start.equalsIgnoreCase("G")) || !(start.equalsIgnoreCase("g")));
        System.out.println("       R2  C3  Han  Luke  Chewie  Leia");
        
            run++;
        }
        while(launch != 1);
        System.out.println("");
        System.out.println("WE ARE GO FOR LAUNCH!");
    }
    public static boolean R2() {
        Random rando = new Random();
        if(rando.nextInt(101) >= 40)
            return true;
        else
            return false;
    }
    public static boolean C3() {
        Random rando = new Random();
        if (rando.nextInt(101) >= 50)
            return true;
        else
            return false;
    }
    public static boolean Han() {
        Random rando = new Random();
        if (rando.nextInt(101) >= 30)
            return true;
        else return false;
    }
    public static boolean Luke() {
        Random rando = new Random();
        if (rando.nextInt(101) >= 20)
            return true;
        else return false;
    }
    public static boolean Chewie() {
        Random rando = new Random();
        if (rando.nextInt(101) >= 35)
            return true;
        else return false;
    }
    public static boolean Leia() {
        Random rando = new Random();
        if (rando.nextInt(101) >= 45)
            return true;
        else return false;
    }
}
