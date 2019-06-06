import java.util.Scanner;

public class Eight_Five {
    //Justin Ecarma
    //4/9/2019
    //Lab 8.5
    //Extra: If a letter is a capital letter, a space will be placed in front of it.
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        int words;
        String decode = "";
        System.out.println("Enter the number of Strings to be entered.");
        words = theScanner.nextInt();
        String[] codewords = new String[words];
        System.out.println("Enter the code words");
        for(int i = 0; i < codewords.length; i++) {
            codewords[i] = theScanner.next();
        }
        for(int i = 0; i < codewords.length; i++) {
            if(((i % 2) == 0) || (i == 0)) {
                if(Character.isUpperCase(codewords[i].charAt(1)))
                    decode += " ";
                decode += codewords[i].charAt(1);
            }
            else {
                if(Character.isUpperCase(codewords[i].charAt(2)))
                    decode += " ";
                decode += codewords[i].charAt(2);
                if(codewords[i].length() > 4) {
                    if(Character.isUpperCase(codewords[i].charAt(4)))
                        decode += " ";
                    decode += codewords[i].charAt(4);
                }
            }
        }
        System.out.println(decode);
    }
}
