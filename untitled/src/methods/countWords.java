package methods;

import java.util.Scanner;

public class countWords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your String: ");
        String str = in.nextLine();
        System.out.println("the number of words is " + count_words(str));

    }

    //    public static int count_words(String str) {
//        int count = 0;
//        String str1[] = str.split(" +");
//        count = str1.length;
//        return count;
//    }
    private static int count_words(String sentence) {
        int count = 0;
        int index = 0;
        do {
            index = sentence.indexOf(" ", index + 1);
            count++;
        } while (index != -1);
        return count;
    }
}
