package flagedControlLoop;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        System.out.println("Start of The Programm  \n");
        drowLine('#', 20);
        System.out.println("\n Welcome to the first program \n");
        drowLine('#', 30);
    }

    static void drowLine(char ch, int length) {
        int i;
        for (i = 0; i < length; i++) {
            System.out.print(ch);
        }
        System.out.println();

    }
}
