package Array;

import java.util.Scanner;

public class ArrayList<A> {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the Array size");

        int size, searchedId;
        size = input.nextInt();
        int[] ids = new int[ size ];
        fillArray(ids);
        printArray(ids);

        System.out.println("Enter the  searched id");
        searchedId = input.nextInt();
        int returnedIndex = searchArray(ids, searchedId);
        if (returnedIndex >= 0)
            System.out.println("item is found");
        else
            System.out.println("item is not found");

    }


    public static void fillArray(int[] list) {

        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter no " + (i + 1));
            list[ i ] = input.nextInt();
        }
    }

    public static void printArray(int[] list) {

        for (int i = 0; i < list.length; i++) {
            System.out.println("print the list " + list[ i ]);

        }
    }

    public static int searchArray(int[] list, int target) {
        for (int i = 0; i < list.length; i++) {
            if (list[ i ] == target)
                return i;
        }
        return -1;

    }
}
