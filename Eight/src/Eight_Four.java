import java.util.Scanner;

public class Eight_Four {
    //Justin Ecarma
    //4/5/2019
    //Lab 8.4
    //
    public static void main(String[] args) {
        int count, howmany;
        String key;
        Scanner theScanner = new Scanner(System.in);
        System.out.println("How many Strings should be in the method");
        howmany = theScanner.nextInt();
        String food[] = {"orange", "apple", "cheese", "cake", "roast beef", "orange", "mutton", "grape", "sushi", "ice cream"};

        System.out.println("Enter the word you would like to search for in the method.");
        key = theScanner.next();
        count = seq_search(food, key);
        System.out.println("There are " + count + " " + key + "(s) in the array.");
    }
    public static int seq_search(String[] food, String key) {
        int count = 0;
        for(String y:food) {
            if(y == key){
                count++;
            }
        }
        return count;
    }
}
