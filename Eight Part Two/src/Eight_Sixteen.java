import java.util.Scanner;

public class Eight_Sixteen {
    //Justin Ecarma
    //5/8/2019
    //Lab 8.16
    //Extra: Menu for the options
    public static void main(String[] args) {
        int casenum;
        Scanner theScanner = new Scanner(System.in);

        String[] name = {"Bowman", "Walker", "Christian", "Edwards", "Cummings", "Halpern", "Scott", "Rhineheart", "Haley", "Brooks" };
        String[] address = {"Canaan", "Newark", "Hardwick", "Montgomery", "Trenton", "Liverpool", "Sheridan", "Houston", "Westfield", "Syosset"};
        String[] state = {"CT", "NJ", "VT", "AL", "NJ", "NY", "WY", "TX", "NJ", "NY"};

        int[] age = {48, 39, 46, 71, 31, 38, 51, 62, 22, 32};
        char[] gender = {'M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M'};

        int[] salary = {18000, 27000, 59000, 78000, 25000, 45000, 19000, 91000, 33000, 40000};
        int[] savings = {4200, 3600, 1900, 500, 7800, 12000, 400, 53200, 4700, 3900};

        String[] car = {"Saturn", "Olds", "Chev", "Chev", "Ford", "Chev", "Ford", "Cad", "Honda", "Ford"};
        int[] year = {2009, 2006, 2010, 2013, 2009, 2012, 2008, 2017, 2004, 2011};

        alphabetic(name, address, state, age, gender, salary, savings, car, year);

        System.out.println("What case would you like to view?");
        System.out.println("1. Case 1");
        System.out.println("2. Case 2");
        System.out.println("3. Case 3");
        System.out.println("4. Case 4");
        casenum = theScanner.nextInt();

        switch (casenum) {
            case(1): {
                for(int i = 0; i < name.length - 1; i++) {
                    if((gender[i] == 'M') && (age[i] > 30) && (car[i].equalsIgnoreCase("Ford")) && (salary[i] > 20000)) {
                        System.out.println("Name:" + name[i]);
                        System.out.println("Address:" + address[i]);
                        System.out.println("");
                    }
                }
                break;
            }
            case(2): {
                for(int i = 0; i < name.length - 1; i++) {
                    if(((car[i].equalsIgnoreCase("Chev")) || (car[i].equalsIgnoreCase("Honda")) || (car[i].equalsIgnoreCase("Ford"))) && (salary[i] > 15000) && (savings[i]) < 2000) {
                        System.out.println("Name:" + name[i]);
                        System.out.println("");
                    }
                }
                break;
            }
            case(3): {
                for(int i = 0; i < name.length - 1; i++) {
                    if(gender[i] == 'F') {
                        System.out.println("Name:" + name[i]);
                        System.out.println("Make:" + car[i]);
                        System.out.println("Year:" + year[i]);
                        System.out.println("");
                    }
                }
                break;
            }
            case(4): {
                for(int i = 0; i < name.length - 1; i++) {
                    if((gender[i] == 'M') && (age[i] < 35) && (car[i].equalsIgnoreCase("Ford")) && (state[i].equalsIgnoreCase("NJ"))) {
                        System.out.println("Name:" + name[i]);
                        System.out.println("");
                    }
                }
                break;
            }
            default: {

            }
        }
    }
    public static void alphabetic(String[] words, String[] address, String[] state, int[] age, char[] gender, int[] salary, int[] savings, String[] car, int[] year) {
        String temp;
        int temp1;
        char temp2;
        boolean flag = true;
        while(flag){
            flag = false;

            for(int i = 0; i < words.length - 1; i++) {
                if((words[i].compareToIgnoreCase(words[i+1])) > 0) {

                    temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;

                    temp = address[i];
                    address[i] = address[i + 1];
                    address[i + 1] = temp;

                    temp = state[i];
                    state[i] = state[i + 1];
                    state[i + 1] = temp;

                    temp1 = age[i];
                    age[i] = age[i + 1];
                    age[i + 1] = temp1;

                    temp2 = gender[i];
                    gender[i] = gender[i + 1];
                    gender[i + 1] = temp2;

                    temp1 = salary[i];
                    salary[i] = salary[i + 1];
                    salary[i + 1] = temp1;

                    temp1 = savings[i];
                    savings[i] = savings[i + 1];
                    savings[i + 1] = temp1;

                    temp = car[i];
                    car[i] = car[i + 1];
                    car[i + 1] = temp;

                    temp1 = year[i];
                    year[i] = year[i + 1];
                    year[i + 1] = temp1;

                    flag = true;
                }
            }
        }
    }
}
