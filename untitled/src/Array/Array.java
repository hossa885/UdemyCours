package Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the size of your array");

        int size;
        size = input.nextInt();
        double sallaries[] = new double[size];
        for(int i=0; i<sallaries.length; i++)
        {
            System.out.println("Please enter the Sallary for Employee no " + (i+1));
            sallaries[i]=input.nextDouble();
        }
        double sum = 0, avg = 0;
        for(int i=0; i<sallaries.length; i++){
            sum += sallaries[i];
        }
        System.out.println("the sum of Sallaries is: " + sum);
        System.out.println("the average of Sallaries is: " + sum/sallaries.length);


    }
}
