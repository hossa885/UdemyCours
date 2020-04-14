package oop;

public class MainEmployee {

    public static void main(String[] args) {

//        Employee e1 = new Employee(100, "Ahmed", true);
//        e1.print_emp_data();

        Employee e2 = new Employee(100,"Hossam", "Accounting", 1000, 500,true);
        e2.print_emp_data();
        System.out.println("befor set sallary");
        e2.set_sallary(7000,600);
        e2.print_emp_data();

    }
}
