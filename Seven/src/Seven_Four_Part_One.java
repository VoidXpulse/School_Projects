import java.io.*;
import java.util.Scanner;

public class Seven_Four_Part_One {
    //Justin Ecarma
    //3/22/2019
    //Lab 7.4 Part 1
    //
    public static void main(String[] args) {
        String answers = "", name = "";
        int nextplayer = 0, filechange;
        Scanner theScanner = new Scanner(System.in);
        System.out.println("Are you appending to or making a new quiz?");
        System.out.println("1. Append");
        System.out.println("2. New");
        System.out.println("Note: The default is to make a new file.");
        filechange = theScanner.nextInt();
        do
        {
            System.out.println("Enter your first name");
            name = theScanner.next();
            answers += name + " ";
            System.out.println("Welcome to Trival Pursuit " + name);
            System.out.println("Answer all question with an int");
            System.out.println("1st Question:");
            System.out.println("What is the best programming language?");
            System.out.println("1. GML (Gamemaker Language)");
            System.out.println("2. HTML5");
            System.out.println("3. Java");
            System.out.println("4. Python");
            answers += answer() + " ";
            System.out.println("2nd Question:");
            System.out.println("What does Clint Eastwood anagram to?");
            System.out.println("1. Ace Wins Lotto");
            System.out.println("2. Nothing, this is a trick");
            System.out.println("3. Lint Cease Twood");
            System.out.println("4. Old West Action");
            answers += answer() + " ";
            System.out.println("3rd Question:");
            System.out.println("What is the evolution of the Pokemon Finneon?");
            System.out.println("1. Luminfis");
            System.out.println("2. Lumineon");
            System.out.println("3. Nothing, it doesn't have an evolution.");
            System.out.println("4. It isn't a Pokemon, it's a Digimon.");
            answers += answer() + " ";
            System.out.println("4th Question:");
            System.out.println("Marvel and DC once had a huge crossover. What was the universe called?");
            System.out.println("1. Justice League vs. Avengers Universe");
            System.out.println("2. Detective Marvel  Universe");
            System.out.println("3. Amalgam Comic Universe");
            System.out.println("4. There was no crossoover");
            answers += answer() + " ";
            System.out.println("5th Question:");
            System.out.println("What is the answer to this question?");
            System.out.println("1. The answer to this question.");
            System.out.println("2. No");
            System.out.println("3. Perhaps");
            System.out.println("4. Yes");
            answers += answer() + " ";
            System.out.println("Are you the last person?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            nextplayer = theScanner.nextInt();
        }
        while(nextplayer != 1);
        if(filechange == 1) {
            try{
                //making file connections
                FileWriter fw = new FileWriter("Seven/src/quiz.txt", true);
                PrintWriter pw = new PrintWriter(fw);
                //appends the files
                pw.print(answers);
                //closes the file
                pw.close();
            }
            catch(IOException e) {
                //error message
                System.out.println(e.getMessage());
            }

        }
        else {
            File quiz = new File("Seven/src/quiz.txt");
            PrintWriter pw;
            //making the file
            //error trapping
            try {
                pw = new PrintWriter(quiz);
                pw.println(answers);
                pw.close();
                //printing to the thing and closing it
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                //error result
            }
        }
    }
    public static int answer() {
        int answer;
        Scanner theScanner = new Scanner(System.in);
        do {
            answer = theScanner.nextInt();
            switch (answer) {
                case (1): {
                    return answer;
                }
                case (2): {
                    return answer;
                }
                case (3): {
                    return answer;
                }
                case (4): {
                    return answer;
                }
                default: {
                    System.out.println("That was not a valid answer. Try again.");
                    break;
                }
            }
        }
        while(1>0);
    }
}
