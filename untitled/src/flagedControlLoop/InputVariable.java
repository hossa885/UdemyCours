package flagedControlLoop;

import java.io.PrintStream;
import java.util.Scanner;

public class InputVariable {


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length, width, area;

        System.out.println("please enter the recatngle length");
        length = input.nextInt();

        System.out.println("please enter the recatngle width");
        width = input.nextInt();


        area = length * width;
        System.out.printf("the recatngle area is %d", area);

    }
}
