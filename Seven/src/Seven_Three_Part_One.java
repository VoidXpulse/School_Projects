import java.io.*;
//importing the thing

public class Seven_Three_Part_One {
    public static void main(String[] args) {
        File dog = new File("Seven/src/Dog.txt");
        PrintWriter pw;
        //making the file
        //error trapping
        try
        {
            pw = new PrintWriter(dog);
            pw.println("Wally 10 Jessie 9 Skeeter 15 Lucky 7 Corky 5 Sadie 6 Alexis 1");
            pw.close();
            //printing to the thing and closing it
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            //error result
        }
    }
}
