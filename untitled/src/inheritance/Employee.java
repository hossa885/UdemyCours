package inheritance;

public abstract class Employee extends Person {
    double salary;
    String rank;
    String job;

    public Employee() {
    }

    public Employee(String n, double a, String ad, String nat, double sal, String r, String j) {
        super(n, a, ad, nat);
        salary = sal;
        rank = r;
        job = j;
    }

    public abstract double getSalary();

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void print_all_details() {
        super.print_all_details();
        System.out.println("Salary: " + salary + "\n Rank: " + rank + "\n Job: " + job);
    }
}
