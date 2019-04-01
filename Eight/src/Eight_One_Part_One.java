import java.text.DecimalFormat;

public class Eight_One_Part_One {
    /*
    Justin Ecarma
    4/1/2019
    Lab 8.1 Part 1

    */
    public static void main(String[] args) {
        DecimalFormat decFor = new DecimalFormat("0.00");
        double finalGrade[] = {85.8, 93.7, 76, 88.5, 100, 91.3};
        double sum = 0;
        for (double y : finalGrade) {
            sum += y;
        }
        System.out.println(decFor.format(sum / finalGrade.length));
    }
}