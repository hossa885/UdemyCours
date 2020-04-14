package klasse;

public class Person {

    //Eigenschaften
    private String name;
    //Konstruktor
    public Person(String name){
        this.name = name;
    }
    //Methoden
    public void printName(){
        System.out.println(this.name);
    }
    public String getName(){
        return name;
    }

}
