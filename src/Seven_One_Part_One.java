import java.io.*;

public class Seven_One_Part_One {
    //Justin Ecarma
    //3/12/2019
    //Lab 7.1 Part One
    //
    public static void main(String[] args) {
        File course = new File("src/course.txt");
        PrintWriter pw;

        try
        {
            pw = new PrintWriter(course);
            pw.println("Justin_Ecarma Java 100 100 100 Hendricks");
            pw.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
