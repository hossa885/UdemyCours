package Array;

import java.util.Scanner;

public class Table {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix = new int[ 5 ][ 3 ];
        fillArray(matrix);
        System.out.println("Array filled out");

        System.out.println("Array will be printed");
        printArray(matrix);

        System.out.println("Array will be summed");
        int total = sumArray(matrix);
        System.out.println("print total " + total);

    }

    public static void fillArray(int[][] list) {
        for (int row = 0; row < list.length; row++)
            for (int col = 0; col < list[ 0 ].length; col++) {
                System.out.println("Enter Data for Roq no " + (row + 1) + " And column no " + (col + 1));
                list[ row ][ col ] = input.nextInt();
            }

    }

    public static void printArray(int[][] list) {

        for (int row = 0; row < list.length; row++)
            for (int col = 0; col < list[ 0 ].length; col++) {
                System.out.println("print all table elements " + list[ row ][ col ]);
            }
    }

    public static int sumArray(int[][] list) {

        int sum = 0;
        for (int row = 0; row < list.length; row++)
            for (int col = 0; col < list[ 0 ].length; col++) {
                sum += list[ row ][ col ];
            }
        return sum;
    }

}
