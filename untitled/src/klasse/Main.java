package klasse;

public class Main {
    public static void main(String[] args){

        Person p1 = new Person("Ralph");



            new Person("Olaf"){

                @Override
                public void printName( ) {
                    System.out.println("Der Name: " + this.getName());
                }
            };
    }
}
