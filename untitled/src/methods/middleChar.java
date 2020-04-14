package methods;

import java.util.Scanner;

public class middleChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();
        System.out.print("The middle character in the string: " + middle(str) + "\n");
    }

    public static String middle(String str) {
        int position;
        int length;
        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;
        } else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        System.out.print("enter string ");
//        String x = input.next();
//        midchar(x);
//    }
//    public static void midchar (String str)
//    {
//        String x;
//        int len = str.length();
//        int mid = len/2;
//        if (mid==0){
//            System.out.print(str.charAt(mid-1));
//            System.out.println(str.charAt(mid));
//        }else{
//            System.out.println (str.charAt(mid));
//        }
//    }

}



