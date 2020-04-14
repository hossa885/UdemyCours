package Revision;

enum Gender {male, female}

public abstract class Employee {
    String name;
    String address;
    int ssn;
    Gender sex;

    public Employee ( ) {
    }

    public Employee (String name, String address, int ssn, Gender sex) {
        this.name = name;
        this.address = address;
        this.ssn = ssn;
        this.sex = sex;

    }

    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getAddress ( ) {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public int getSsn ( ) {
        return ssn;
    }

    public void setSsn (int ssn) {
        this.ssn = ssn;
    }

    public abstract double earnings ( );

    @Override
    public String toString ( ) {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", ssn=" + ssn +
                ", sex=" + sex +
                '}';
    }
}
