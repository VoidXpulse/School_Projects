import java.util.Scanner;

public class Eight_Fourteen {
    //Justin Ecarma
    //5/6/2019
    //Lab 8.14
    //
    public static void main(String[] args) {
        double[] yeet = {15.5, 24.6, 32.7, 14.3, 15.8};

        exchange(yeet);
        //sorting the array
        boolean success;
        double key = 22;
        int top = yeet.length - 1, bottom = 0;
        Scanner theScanner = new Scanner(System.in);
        System.out.println("Choose a number to search the array for.");
        key = theScanner.nextDouble();
        if(binarySearch(yeet, key, top, bottom)) {
            System.out.println("The key was found.");
        }
        else {
            System.out.println("The key was not found.");
        }
    }
    public static void exchange(double[] numbers) {
        double temp;

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
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
