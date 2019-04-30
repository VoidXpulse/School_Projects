public class Eight_Eleven   {
    public static void main(String[] args) {
        String[] name = {"Jerry", "Luigi", "Bob", "Joe", "Tom", "Ace", "Zac", "Pal", "Jan", "Vito"};
        int[] customer = {10223, 32443, 34598, 45920, 46840, 93462, 39583, 79367, 34850, 38450, };
        int[] movie = {123, 345, 254, 435, 664, 758, 754, 879, 234, 156};
        int[] rental = {1, 1, 1, 5, 1, 5, 5, 5, 1, 5};
        int[] days = {5, 46, 24, 3, 1, 5, 23, 1, 1, 4};
        boolean[] late = new boolean[10];

        for(int i = 0; i < late.length; i++) {
            if(days[i] > rental[i]) {
                late[i] = true;
            }
            else {
                late[i] = false;
            }
        }

        arraySort(name, customer, movie, rental, days, late);

        for(int i = 0; i < late.length; ) {
            if(late[i]) {
                System.out.println(name[i]);
            }
        }

        for(int i = 0; i < late.length; ) {
            if(!(late[i])) {
                System.out.println(name[i]);
            }
        }
    }
    public static void arraySort(String[] name, int[] customer, int[] movie, int[] rental, int[] days, boolean[] late)  {
        int temp;
        boolean temp2;
        String temp3;
        boolean flag = true;
        while(flag){
            flag = false;

            for(int i = 0; i < customer.length - 1; i++) {
                if(customer[i] < customer[i+1]) {

                    temp = customer[i];
                    customer[i] = customer[i + 1];
                    customer[i + 1] = temp;

                    temp3 = name[i];
                    name[i] = name[i + 1];
                    name[i + 1] = temp3;

                    temp = movie[i];
                    movie[i] = movie[i + 1];
                    movie[i + 1] = temp;

                    temp = rental[i];
                    rental[i] = rental[i + 1];
                    rental[i + 1] = temp;

                    temp = days[i];
                    days[i] = days[i + 1];
                    days[i + 1] = temp;

                    temp2 = late[i];
                    late[i] = late[i + 1];
                    late[i + 1] = temp2;

                    flag = true;
                }
            }
        }
    }
}
