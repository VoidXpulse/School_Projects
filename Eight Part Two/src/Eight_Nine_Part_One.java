public class Eight_Nine_Part_One {
    //Justin Ecarma
    //4/26/2019
    //Lab 8.9
    //
    public static void main(String[] args) {
        String[] words = {"camel", "ant", "dog", "cat", "horse", "mule", "java", "goose"};
        String[] friends = {"", "", "", "", ""};
        alphabetic(words);

        for(String y:words) {
            System.out.println(y);
        }

        do {

        }
        while(friends[4] == "");
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
