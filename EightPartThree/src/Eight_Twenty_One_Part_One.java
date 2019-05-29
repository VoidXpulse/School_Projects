import java.util.Random;
//importing the things
public class Eight_Twenty_One_Part_One {
    //Justin Ecarma
    //5/28/2019
    //Lab 8.21 Part 1
    //Extra:
    public static void main(String[] args) {
        Random rando = new Random();
        int[] numbers = new int[25];
        String odd = "", even = "";
        int place;
        //declaring and initializing variables

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rando.nextInt();

            if(numbers[i] < 1) {
                place = numbers[i];
                numbers[i] = place * -1 + 1;
            }
        }
        //making the random array

        for(int y:numbers) {
            if((y % 2) == 0) {
                even += y + " ";
            }
            else {
                odd += y + " ";
            }
        }
        //dividing the even and odd numbers into groups

        //printing the result
        System.out.println("Odd: " + odd);

        System.out.println("Even: " + even);
    }
}
