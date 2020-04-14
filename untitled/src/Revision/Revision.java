package Revision;


public class Revision {
    public static void main(String[] args){

        Department d1 = new Department(1, "Information System");
        SalariedEmployee se = new SalariedEmployee(200, 500,50, "Ahmed", "Riyadh", 1200, Gender.male);
        d1.add_employee(se);
        HourlyEmployee he = new HourlyEmployee("Mohamed","Kharj",1200, Gender.male, 3,12);
        d1.add_employee(he);
        CommissionEmployee ce = new CommissionEmployee("Fatema", "Riyadh", 1200, Gender.female, 1200,200);


        d1.add_employee(ce);
        System.out.println(d1.getEmployeeCount());
        d1.print_basic_data();
        d1.print_all_details();

    }

}
