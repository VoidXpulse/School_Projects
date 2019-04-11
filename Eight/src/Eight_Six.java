import java.util.Scanner;

public class Eight_Six {
    public static void main(String[] args) {
        boolean success;
        int count = 2, word = 0, place;
        int key = 22;
        Scanner theScanner = new Scanner(System.in);
       int numbers[] = {11, 16, 21, 23, 34, 46, 48, 50, 75, 78};
       place = numbers.length/2;
        while(1<2) {
            if(numbers[0] == key) {
                success = true;
                break;
            }
            else if(numbers[0] > key) {
                success = false;
                break;
            }
            else {

            }
            System.out.println("1");
            if(numbers[numbers.length - 1] == key) {
                success = true;
                break;
            }
            else if(numbers[numbers.length - 1] < key) {
                success = false;
                break;
            }
            else {

            }
            System.out.println("2");
            if(numbers[place] == key){
                success = true;
                break;
            }
            else if(numbers[place] > key) {
                place /= 2;
            }
            else if(place == numbers.length) {
                success = false;
                break;
            }
            else if{

            }
            else{
                place += numbers.length/(2^count);
            }
            count++;
            System.out.println("3");
        }
        if(success = true) {
            System.out.println("FIN");
            System.out.println(count);
        }
        else {
            System.out.println("Lol u succ");
            System.out.println(count);
        }
    }
}
