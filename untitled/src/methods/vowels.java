package methods;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input ur String");
        String str = in.nextLine();
        System.out.println("number of ur vowels is: " + vowels_number(str) + "\n");
    }

    public static int vowels_number(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
            return count;
        }
    }
