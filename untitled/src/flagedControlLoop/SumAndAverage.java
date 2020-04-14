package flagedControlLoop;

public class SumAndAverage {


    static int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    static double average(int n1, int n2, int n3) {
        return sum (n1 , n2 , n3) / 3;

    }
    static void display(int s, double avg ){
        System.out.println("the total of sum ist: " +s);
        System.out.println("the total of average ist: " + avg);
    }
}
