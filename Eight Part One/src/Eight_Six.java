import java.util.Scanner;

public class Eight_Six {
    //Justin Ecarma
    //4/22/2019
    //Lab 8.6
    //Extra: The user can choose the number to search for.
    public static void main(String[] args) {
        boolean success;
        double numbers[] = {11.1, 16.2, 22.4, 23.4, 34.2, 46.2, 48.4, 50.5, 75.6, 78.7};
        double key = 22;
        int top = numbers.length - 1, bottom = 0;
        Scanner theScanner = new Scanner(System.in);
        System.out.println("Choose a number to search the array for.");
        key = theScanner.nextDouble();
        if(binarySearch(numbers, key, top, bottom)) {
            System.out.println("The key was found.");
        }
        else {
            System.out.println("The key was not found.");
        }
    }
    public static boolean binarySearch(double numbers[], double key, int top, int bottom) {
        return binarySearchOne(numbers, key, top, bottom);
    }
    public static boolean binarySearchOne(double numbers[], double key, int top, int bottom) {
        if(bottom > top) {
            return false;
        }
        int mid = (bottom + top) / 2;

        if(numbers[mid] == key) {
            return true;
        }
        else if(key < numbers[mid]){
            return binarySearchOne(numbers, key, mid - 1, bottom);
        }
        else {
            return binarySearchOne(numbers, key, top, mid +1);
        }
    }
}
