import java.util.Scanner;

public class Eight_Nine_Part_One {
    //Justin Ecarma
    //4/26/2019
    //Lab 8.9
    //
    public static void main(String[] args) {
        int oscar = -1;
        Scanner theScanner = new Scanner(System.in);
        String[] words = {"camel", "ant", "dog", "cat", "horse", "mule", "java", "goose"};
        String[] friends = new String[5];
        String[] terms = new String[10];
        alphabetic(words);
        printArray(words);

        System.out.println("Enter five friend's names.");
        for(int i = 0; i < friends.length; i++) {
            friends[i] = theScanner.next();
        }
        printArray(friends);
        alphabetic(friends);
        printArray(friends);
        oscar = seqSearch(friends);
        if(oscar != -1) {
            System.out.println("Oscar is at friends[" + oscar + "].");
        }
        else {
            System.out.println("Oscar not found");
        }
        System.out.println("Enter ten computer terms.");
        for(int i = 0; i < terms.length; i++) {
            terms[i] = theScanner.next();
        }
        printArray(terms);
        alphabetic(terms);
        printArray(terms);
        if (binarySearch(terms, "mouse", terms.length - 1, 0)) {
            System.out.println("Mouse is in the array.");
        }
        else {
            System.out.println("Mouse isn't in the array.");
        }
    }
    public static void alphabetic(String[] words) {
        String temp;
        boolean flag = true;
        while(flag){
            flag = false;

            for(int i = 0; i < words.length - 1; i++) {
                if((words[i].compareToIgnoreCase(words[i+1])) > 0) {
                    temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
    public static void printArray(String[] words) {
        for(String y:words) {
            System.out.println(y);
        }
    }
    public static int seqSearch(String[] words) {
        int oscar = -1;
        for(int t = 0; t < words.length; t++) {
            if(words[t].equalsIgnoreCase("Oscar")) {
                oscar = t;
            }
        }
        return oscar;
    }
    public static boolean binarySearch(String numbers[], String key, int top, int bottom) {
        return binarySearchOne(numbers, key, top, bottom);
    }
    public static boolean binarySearchOne(String numbers[], String key, int top, int bottom) {
        if(bottom > top) {
            return false;
        }
        int mid = (bottom + top) / 2;

        if(numbers[mid].equalsIgnoreCase(key)) {
            return true;
        }
        else if(key.equalsIgnoreCase(numbers[mid])){
            return binarySearchOne(numbers, key, mid - 1, bottom);
        }
        else {
            return binarySearchOne(numbers, key, top, mid +1);
        }
    }
}
}
