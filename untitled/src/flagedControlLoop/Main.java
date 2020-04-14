package flagedControlLoop;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        int n1, n2, n3, totalSum;
        double avg;

        Scanner input = new Scanner(in);

        out.println("please enter the first number");
        n1 = input.nextInt();

        out.println("please enter the second number");
        n2 = input.nextInt();

        out.println("please enter the third number");
        n3 = input.nextInt();

        totalSum = SumAndAverage.sum(n1, n2, n3);
        avg = SumAndAverage.average(n1, n2, n3);

        SumAndAverage.display(totalSum,avg);

    }

}
