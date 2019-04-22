public class Eight_Seven {
    public static void main(String[] args) {
        int[] numbers = {2,3,3454,43,32,4,45,56,24353,4353453,4,53,5,43,543,5,34,564876,768763,64,6867,2375765,34377696,890786,4,673,652521165,645765,756753637,868645464};
        bubble(numbers);
        for(int y:numbers) {
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
    public static void exchange(int[] numbers) {
        int temp;
        for(int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] < numbers[i+1]) {
                temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }
    }
}
