package Revision;

public class CommissionEmployee  extends Employee implements Displayable{
    private double gross_sales;
    private double commession_rate;

    public double getGross_sales ( ) {
        return gross_sales;
    }

    public void setGross_sales (double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getCommession_rate ( ) {
        return commession_rate;
    }

    public void setCommession_rate (double commession_rate) {
        this.commession_rate = commession_rate;
    }

    public CommissionEmployee ( ) {
    }

    public CommissionEmployee (String name, String address, int ssn, Gender sex, double gross_sales, double commession_rate) {
        super(name, address, ssn, sex);
        this.gross_sales = gross_sales;
        this.commession_rate = commession_rate;
    }
    @Override
    public double earnings(){
        return gross_sales * commession_rate;
    }
    public void DisplayAllDetails ( ) {
        System.out.println(super.toString());
        System.out.println(toString());

    }

    public void DisplayEarning ( ) {
        System.out.println(earnings());

    }

    @Override
    public String toString ( ) {
        return "CommissionEmployee{" +
                "gross_sales=" + gross_sales +
                ", commession_rate=" + commession_rate +
                '}';
    }


}
