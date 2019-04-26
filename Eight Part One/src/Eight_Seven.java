public class Eight_Seven {
    public static void main(String[] args) {
        int[] numbers = {65, 45, 34, 12, 99, 54, 39, 2, 88, 18};
        double[] numbers2 = {43.2, 13.6, 91.4, 23.6, 72.1};
        String[] words = {"a", "g", "k", "j", "t", "i", "f", "s", "w", "b"};
        bubble(numbers);
        for(int y:numbers) {
            System.out.println(y);
        }
        exchange(numbers2);
        for(double y:numbers2) {
            System.out.println(y);
        }
        alphabetic(words);
        for(String y:words) {
            System.out.println(y);
        }
    }
    public static void bubble(int[] numbers) {
        int temp;
        boolean flag = true;
        while(flag){
            flag = false;

            for(int i = 0; i < numbers.length - 1; i++) {
                if(numbers[i] < numbers[i+1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
    public static void exchange(double[] numbers) {
        double temp;

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
    public static void alphabetic(String[] words) {
        String temp;
        boolean flag = true;
        while(flag){
            flag = false;

            for(int i = 0; i < words.length - 1; i++) {
                if((words[i].compareToIgnoreCase(words[i+1])) > 0) {
                    temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}
