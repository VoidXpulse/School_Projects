import java.util.Random;

public class Eight_Twelve {
    //Justin Ecarma
    //5/2/2019
    //Lab 8.12
    //Extra: Delay is slightly randomized
    public static void main(String[] args) throws InterruptedException {
        Random rando = new Random();
        String quote1 = "Remember, all I'm offering is the truth. Nothing more.";
        String quote2 = "Matrix Reloaded";
        String name = "Keanu Reeves" ;
        String[] matrix = {"Neo", "Morpheus", "Trinity", "Smith", "Mouse", "Cypher"};
        for(int i = 0; i < quote1.length(); i++) {
            System.out.print(quote1.charAt(i));

            Thread.sleep(rando.nextInt(101) + 450);
        }
        System.out.println("");
        System.out.println("The Matrix has you.");
        Thread.sleep(2500);
        System.out.println("Follow the white rabbit.");
        Thread.sleep(2500);
        System.out.println("Knock, knock, Neo.");

        System.out.println(name.substring(name.indexOf(" ") + 1) + ", " + name.substring(0 , name.indexOf(" ")));

        for(int i = 0; i < quote2.length(); i++) {
            System.out.print(quote2.charAt(i));

            Thread.sleep(rando.nextInt(101) + 450);
        }
        System.out.println("");
        alphabetic(matrix);
        printArray(matrix);
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
}
