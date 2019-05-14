import java.util.Random;

public class Eight_Eighteen {
    //Justin Ecarma
    //5/14/2019
    //Lab 8.18
    //Extra: Students have a 1/2 chance to follow conduct during the ceremony
    public static void main(String[] args) {
        Random rando = new Random();
        int[] id = {123456, 124563, 134522, 143266, 145667, 187622, 164522};
        String[] names = {"Smith, Kevin", "Jones, Sarah", "Kelly, Jonathan", "Clift, Edward", "Ogden, Beatrice", "Walter, Benjamin",  "Edwards, Steven"};
        int[] hours = {144, 134, 130, 146, 133, 120, 124};
        double[] gpa = {3.0, 2.5, 3.5, 1.5, 4.0, 3.0, 1.8};
        boolean[] hoursbool = new boolean[hours.length];
        boolean[] gpabool = new boolean[gpa.length];
        boolean[] conduct = new boolean[names.length];
        alphabetic(names, id, hours, gpa);
        for(int i = 0; i < hours.length - 1; i++) {
            conduct[i] = rando.nextBoolean();
        }
        for(int i = 0; i < hours.length - 1; i++) {
            if(hours[i] >= 132) {
                hoursbool[i] = true;
            }
            else {
                hoursbool[i] = false;
            }
        }
        for(int i = 0; i < hours.length - 1; i++) {
            if(gpa[i] >= 2.0) {
                gpabool[i] = true;
            }
            else {
                gpabool[i] = false;
            }
        }
        for(int i = 0; i < hours.length - 1; i++) {
            System.out.print("ID: " + id[i]);
            System.out.print(" Name: " + names[i]);
            if(hoursbool[i] && gpabool[i]) {
                if(conduct[i]) {
                    System.out.println(" Status: OK to graduate");
                }
                else {
                    System.out.println(" Status: Failed to follow conduct during graduation ceremony");
                }
            }
            else if(!hoursbool[i] && gpabool[i]) {
                System.out.println(" Status: Not enough credit hours");
            }
            else if(!hoursbool[i] && !gpabool[i]) {
                System.out.println(" Status: GPA is too low");
            }
            else{
                System.out.println(" Status: GPA and Hours are too low");
            }
        }
    }
    public static void alphabetic(String[] words, int[] id, int[] hours, double[] gpa) {
        String temp;
        int temp1;
        double temp2;
        boolean flag = true;
        while(flag){
            flag = false;

            for(int i = 0; i < words.length - 1; i++) {
                if((words[i].compareToIgnoreCase(words[i+1])) > 0) {

                    temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;

                    temp1 = id[i];
                    id[i] = id[i + 1];
                    id[i + 1] = temp1;

                    temp1 = hours[i];
                    hours[i] = hours[i + 1];
                    hours[i + 1] = temp1;

                    temp2 = gpa[i];
                    gpa[i] = gpa[i + 1];
                    gpa[i + 1] = temp2;

                    flag = true;
                }
            }
        }
    }
}
