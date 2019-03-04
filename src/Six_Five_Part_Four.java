import java.util.Random;

public class Six_Five_Part_Four {
    //Justin Ecarma
    //3/4/2019
    //Lab 6.5 Part Four
    //
    public static void main(String[] args) {
        Random rando = new Random();
        int dice = (rando.nextInt(2) + 1);

        System.out.println(dice);
    }
}
