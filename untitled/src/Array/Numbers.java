package Array;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the size of your array");

        int size;
        size = input.nextInt();
        int numbers[] = new int[size];
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println("Please enter the Sallary for Employee no " + (i+1));
            numbers[i]=input.nextInt();
        }
        int sum = 0, count = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>0) {
                sum += numbers[ i ];
            }
            count++;

        }
        System.out.println("the average of positve numbers is: " + sum/count);


    }
}
