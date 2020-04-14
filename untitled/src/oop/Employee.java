package oop;

public class Employee {

    int emp_ID;
    String name;
    String depart;
    double salary;
    double bonus;
    boolean resident;

    public Employee() {
        emp_ID = 100;
        name = "no Name";
        salary = 3000;
        depart = "Not assigned yet";
        bonus = 500;
        resident = true;
    }

    public Employee(int emp_ID, String name) {
        this.emp_ID = emp_ID;
        this.name = name;
    }

    public Employee(int emp_ID, String name, boolean resident) {
        this(emp_ID, name);
        this.resident = resident;

    }

    public Employee(int emp_ID, String name, String depart, double salary, double bonus, boolean resident) {
        this(emp_ID, name, resident);
        this.bonus = bonus;
        this.salary = salary;
        this.depart = depart;

    }

    public void set_sallary(double salary){
        this.salary = salary;
    }
    public void set_sallary(double salary, double bonus){
        this.set_sallary(salary);
        this.bonus= bonus;
    }

    public void print_emp_data() {
        System.out.println("Employee id: " + emp_ID);
        System.out.println("Employee name: " + name);
        System.out.println("Employee department: " + depart);
        System.out.println("Employee salary: " + salary);
        System.out.println("Employee bonus: " + bonus);
        System.out.println("Employee resident: " + resident);
    }
}
