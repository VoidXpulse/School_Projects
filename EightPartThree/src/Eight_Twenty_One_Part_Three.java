import java.util.Random;
//importing the things
public class Eight_Twenty_One_Part_Three {
    //Justin Ecarma
    //5/28/2019
    //Lab 8.21 Part 2
    //Extra: The numbers are randomized
    public static void main(String[] args) {
        Random rando = new Random();
        int[] numbers = new int[25];
        //declaring and initializing variables

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rando.nextInt(1000) + 1;
        }
        //making the random array

        bubble(numbers);
        //sorting
        //printing the result
        System.out.println("Mean: " + mean(numbers));
        System.out.println("Median: " + numbers[median(numbers)]);
        System.out.println("Maximum: " + numbers[numbers.length - 1]);
        System.out.println("Minimum: " + numbers[0]);
        System.out.println("Range: " + numbers[0] + " - " + numbers[numbers.length - 1]);
        System.out.println("Variance: " + variance(numbers));
        System.out.println("Standard Deviation: " + Math.sqrt(variance(numbers)));
    }
    public static int mean(int[] numbers) {
        int mean = 0;

        for(int i = 0; i < numbers.length; i++) {
            mean += numbers[i];
        }
        mean = mean / numbers.length;
        return mean;
    }
    public static int median(int[] numbers) {
        int median = 0;

        median = numbers.length / 2;

        return median;
    }
    public static int variance(int[] numbers) {
        int variance = 0, mean = mean(numbers);

        for(int i = 0; i < numbers.length; i++) {
            if(mean > numbers[i]){
                variance += (mean - numbers[i])^2;
            }
            else {
                variance += (numbers[i] - mean)^2;
            }
        }

        variance = variance / numbers.length;
        return variance;
    }
    public static void bubble(int[] numbers) {
        int temp;
        boolean flag = true;
        while(flag){
            flag = false;

            for(int i = 0; i < numbers.length - 1; i++) {
                if(numbers[i] > numbers[i+1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}
