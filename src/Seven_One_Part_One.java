import java.io.*;
//importing the thing
public class Seven_One_Part_One {
    //Justin Ecarma
    //3/12/2019
    //Lab 7.1 Part One
    //
    public static void main(String[] args) {
        File course = new File("src/course.txt");
        PrintWriter pw;
        //making the file
        //error trapping
        try
        {
            pw = new PrintWriter(course);
            pw.println("Justin_Ecarma Java 100 100 100 Hendricks");
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
