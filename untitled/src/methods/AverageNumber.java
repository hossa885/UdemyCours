package methods;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the first number");
        double x = scan.nextDouble();

        System.out.println("please enter the second number");
        double y = scan.nextDouble();

        System.out.println("please enter the third number");
        double z = scan.nextDouble();

        System.out.println("the average number is: " + average(x, y, z));

    }

    public static double average (double x, double y, double z){

        return (x+y+z) /3;
    }
}
