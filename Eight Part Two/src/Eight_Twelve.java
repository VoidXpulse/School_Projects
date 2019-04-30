public class Eight_Twelve {
    public static void main(String[] args) throws InterruptedException {
        String quote1 = "Remember, all I'm offering is the truth. Nothing more";

        for(int i = 0; i < quote1.length(); i++) {
            System.out.print(quote1.charAt(i));

            Thread.sleep(1000);
        }
    }
}
