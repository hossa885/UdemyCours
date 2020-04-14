package Revision;

public class BasePlusCommesionEmployee extends CommissionEmployee {

    private double base;

    public double getBase ( ) {
        return base;
    }

    public void setBase (double base) {
        this.base = base;
    }

    @Override
    public double earnings ( ) {
        return base + super.earnings();
    }

    @Override
    public void DisplayAllDetails ( ) {
        super.DisplayAllDetails();
        DisplayEarning();
    }

    @Override
    public void DisplayEarning ( ) {
        System.out.println("Earnings = " + earnings());
    }
}
