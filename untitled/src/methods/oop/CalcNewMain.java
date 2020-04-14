package methods.oop;

import java.util.Scanner;

public class CalcNewMain {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter number 1: ");
        double num1 = s.nextDouble();

        System.out.println("enter number 2: ");
        double num2 = s.nextDouble();


        Calc c1 = new Calc(num1, num2);
        System.out.println(c1.add());
        System.out.println(c1.Sub());
        System.out.println(c1.Multi());
        System.out.println(c1.Div());


    }
}
