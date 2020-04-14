package methods;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the first number");
        int x = scan.nextInt();

        System.out.println("please enter the second number");
        int y = scan.nextInt();

        System.out.println("please enter the third number");
        int z = scan.nextInt();
        System.out.println("the average value is: " + average(x,y,z));
    }

    @Contract(pure = true)
    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;

    }
}

