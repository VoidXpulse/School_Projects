import java.util.Scanner;

public class Eight_Six {
    //Justin Ecarma
    //4/22/2019
    //Lab 8.6
    //Extra: The user can choose the number to search for.
    public static void main(String[] args) {
        boolean success;
        int numbers[] = {11, 16, 22, 23, 34, 46, 48, 50, 75, 78};
        int key = 22;
        int top = numbers.length - 1, bottom = 0;
        Scanner theScanner = new Scanner(System.in);
        System.out.println("Choose a number to search the array for.");
        key = theScanner.nextInt();
        if(binarySearch(numbers, key, top, bottom)) {
            System.out.println("The key was found.");
        }
        else {
            System.out.println("The key was not found.");
        }
    }
    public static boolean binarySearch(int numbers[], int key, int top, int bottom) {
        return binarySearchOne(numbers, key, top, bottom);
    }
    public static boolean binarySearchOne(int numbers[], int key, int top, int bottom) {
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
