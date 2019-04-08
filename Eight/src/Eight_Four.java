import java.util.Random;
import java.util.Scanner;

public class Eight_Four {
    //Justin Ecarma
    //4/5/2019
    //Lab 8.4
    //Extra:A new set of words gets generated each time you run the program.
    public static void main(String[] args) {
        int count, word;
        String key;
        Scanner theScanner = new Scanner(System.in);
        Random rando = new Random();
        String food[] = new String[10];
        for(int i = 0; i < 10; i++) {
            word = rando.nextInt(10);
            if(word <= 4) {
                food[i] = "orange";
            }
            else if(word == 5) {
                food[i] = "apple";
            }
            else if(word == 6) {
                food[i] = "banana";
            }
            else if(word == 7) {
                food[i] = "grape";
            }
            else if(word == 8) {
                food[i] = "pear";
            }
            else {
                food[i] = "blueberry";
            }
        }
        System.out.println("Enter the word you would like to search for in the method.");
        key = theScanner.next();
        count = seq_search(food, key);
        System.out.println("There are " + count + " " + key + "(s) in the array.");
    }
    public static int seq_search(String[] food, String key) {
        int count = 0;
        for(String y:food) {
            if(y.equals(key)){
                count++;
            }
        }
        return count;
    }
}
