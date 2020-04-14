package methods;

import java.util.Scanner;

public class smallstNumber {

    public static void findSmall(double a, double b , double c)
    {
        double[] array = new double[] {a, b, c};
        double min = array[0];

        for(int i = 0; i < array.length; i++) {
            if (min < array[ i ]) {
                min = array[ i ];
            }
        }
        System.out.println("the smallest number is " + min);
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("please type 3 numbers");

        double x = sc.nextInt();
        double y = sc.nextInt();
        double z = sc.nextInt();

        findSmall(x,y,z);
    }
}
