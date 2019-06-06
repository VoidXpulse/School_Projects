import java.util.Random;

public class Eight_One_Part_Two {
    /*
    Justin Ecarma
    4/1/2019
    Lab 8.1 Part 2

    */
    public static void main(String[] args) {
        Random rando = new Random();
        int[] randomnum = new int[10];
        int count = 0;
        for(int y = 0; y < 10; y++)
        {
            randomnum[y] = rando.nextInt(10) + 1;
        }
        for(int z:randomnum)
        {
            System.out.print(z + " ");
        }
        System.out.println();
        for(int y = 9; y > -1; y--)
        {
            System.out.print(randomnum[y] + " ");
        }
        System.out.println();
        for(int z:randomnum)
        {
            if(z % 2 == 0)
            {
                count++;
            }
        }
        System.out.println("The total number of even numbers is " + count + ".");
    }
}
