package flagedControlLoop;

import java.util.Scanner;

public class InputVariable1 {


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = "";
        float salary;
        float net_salary;

        System.out.println("please enter your name");
        name = input.next();

        System.out.println("please enter your salary");
        salary = input.nextFloat();


        net_salary = salary-(salary*0.10f);

        System.out.println("the net salary for " + name + " is " + net_salary);
//
//        System.out.println(Math.abs(net_salary));
    }
}
