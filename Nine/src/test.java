public class test {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 7; i = i + 2) {
            for (int j = 1; j <= i; j =+ 3) {
                total += j;
            }
        }
        System.out.println(total);
    }
}
