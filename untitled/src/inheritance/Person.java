package inheritance;

public class Person {

    protected String name;
    protected double age;
    private String address;
    private String nationality;


    public Person() {
        System.out.println("I'm the Person class constructor");
    }

    public Person(String n, double a, String ad, String nat){
        name= n;
        age = a;
        address = ad;
        nationality= nat;

    }

    public double getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;

    }

    public String getNationality() {
        return nationality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    //    public String updateAddress(Person person){
//        this.address=person.address;
//        return person.getAddress();
//
//    }

    public void print_all_details(){
        System.out.println("Name: " + name + "\n Age: " + age + "\n Nationality: " + nationality + "\n Address: " + address );
    }
}
