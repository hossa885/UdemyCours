package methods;

import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your degits");
        int digits = in.nextInt();
        System.out.println("result is: " + sum_digits(digits) + "\n");
    }
    public static int sum_digits(int n){
        int result =0;
        while (n>0){
            result += n%10;
            n/=10;
        }
        return result;
    }
}
