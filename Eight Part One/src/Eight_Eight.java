import java.util.Scanner;

public class Eight_Eight {
    public static void main(String[] args) {
        int sorter;
        Scanner theScanner = new Scanner(System.in);
        String[] name = {"Barney Fife", "Luke Skywalker", "Cruella Deville", "Sally Smith", "Marsha Brady", "Gomez Addams", "John Adams", "Marie Antoinette", "Albert Einstein","Mick Jagger", "Mickey Mouse"};
        String[] address = {"10 Warbler Rd.", "R2 Death Star Ave.", "123 Witchey Way", "3862 Street Blvd.", "1970 Groovy Street", "1 Spooky Circle", " 3445 Presidential Plaza", "2 Rue Morgue", "7 Relativity Rd.", "100 Rolling Stone Path", "2 Disney Lane"};
        String[] city = {"Mountainville, SC 34765", "Jupiter, MD 44623", "Hollywood, CA 12345", "Springfield, IL 31733", "Arlington, VA 51266", "Tombstone, AZ 63341", "New York, NY 11220", "New Orleans, LA 25993", "Topeka KS 63121", "Seattle, WA 23733", "Orlando, FL 72272"};

        System.out.println("Chose what order you would like to view in.");
        System.out.println("1. Last Name \n2. Name of City \n3. Number of Zipcode");
        sorter = theScanner.nextInt();

        if(sorter == 1) {
            lastname(name, address, city);
        }
        else if (sorter == 2) {
            namecity(name, address, city);
        }
        else {
            zip(city, name, address);
        }
        for(int i = 0; i < name.length - 1; i++) {
            System.out.print(name[i]);
            System.out.print(" | ");
            System.out.print(address[i]);
            System.out.print(" | ");
            System.out.println(city[i]);
        }
    }
    public static void lastname(String[] name, String[] address, String[] city) {
        String temp;
        boolean flag = true;
        while(flag){
            flag = false;

            for(int i = 0; i < name.length - 1; i++) {
                if((name[i].substring(name[i].indexOf(" "), (name[i].indexOf(" ") + 2)).compareToIgnoreCase(name[i + 1].substring(name[i + 1].indexOf(" "), (name[i + 1].indexOf(" ") + 2)))) > 0) {
                    temp = name[i];
                    name[i] = name[i + 1];
                    name[i + 1] = temp;

                    temp = address[i];
                    address[i] = address[i + 1];
                    address[i + 1] = temp;

                    temp = city[i];
                    city[i] = city[i + 1];
                    city[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
    public static void namecity(String[] name, String[] address, String[] city) {
            String temp;
            boolean flag = true;
            while(flag){
                flag = false;

                for(int i = 0; i < city.length - 1; i++) {
                    if((city[i].compareToIgnoreCase(city[i+1])) > 0) {
                        temp = city[i];
                        city[i] = city[i + 1];
                        city[i + 1] = temp;

                        temp = name[i];
                        name[i] = name[i + 1];
                        name[i + 1] = temp;

                        temp = address[i];
                        address[i] = address[i + 1];
                        address[i + 1] = temp;
                        flag = true;

                }
            }
        }
    }
    public static void zip(String[] name, String[] address, String[] city) {
        String temp, number = "";
        boolean flag = true;
        int g;
        while(flag){
            flag = false;

            for(int i = 0; i < name.length - 1; i++) {

                for (g = 0; g < 9; g++)
                    number = Integer.toString(g);
                    System.out.println(name[i].substring(name[i].indexOf(" " + number), (name[i].indexOf(" " + number) + 2)));
                if ((name[i].substring(name[i].indexOf(" " + number), (name[i].indexOf(" " + number) + 2)).compareToIgnoreCase(name[i + 1].substring(name[i + 1].indexOf(" " + number), (name[i + 1].indexOf(" " + number) + 2)))) > 0) {
                    temp = name[i];
                    name[i] = name[i + 1];
                    name[i + 1] = temp;

                    temp = address[i];
                    address[i] = address[i + 1];
                    address[i + 1] = temp;

                    temp = city[i];
                    city[i] = city[i + 1];
                    city[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}
