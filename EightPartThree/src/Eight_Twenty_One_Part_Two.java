import java.util.Random;
//importing the things

public class Eight_Twenty_One_Part_Two {
    //Justin Ecarma
    //5/28/2019
    //Lab 8.21 Part 2
    //Extra: The numbers are randomized, except for two, which are preset for the conditions of the lab
    public static void main(String[] args) {
        Random rando = new Random();
        int[] numbers = new int[12];
        boolean[] palindromes = new boolean[numbers.length];
        String number = "";
        //declaring and initializing variables

        for(int i = 0; i < 12; i++) {
            if(i == 11) {
                numbers[i] = 212;
            }
            else if(i == 1) {
                numbers[i] = 616;
            }
            else {
                numbers[i] = rando.nextInt(1000);
            }
        }
        //declaring the random ints

        for(int i = 0; i < palindromes.length; i++) {
            palindromes[i] = false;
        }
        //setting the array to false

        for(int i = 0; i < palindromes.length; i++) {
            number = numbers[i] + "";
            if((number.charAt(1) == '0' ) && (numbers[i] < 100)){
                palindromes[i] = true;
            }
            if((numbers[i] > 100) && (number.charAt(0) == number.charAt(2))) {
                palindromes[i] = true;
            }
        }
        //finding the palindromes

        for(int i = 0; i < palindromes.length; i++) {
            if(palindromes[i]) {
                System.out.println(numbers[i] + " is a palindrome");
            }
            else{
                System.out.println(numbers[i] + " is not a palindrome");
            }
        }
        //printing the result

    }
}
