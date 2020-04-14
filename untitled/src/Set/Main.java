package Set;

import java.util.*;

class Person {
    private int id;
    private String name;

    public Person (int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String toString ( ) {
        return "ID: " + this.id + "Name: " + this.name;
    }
// Right click -->Generate--> equals and hashCode()
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id &&
                name.equals(person.name);
    }

    @Override
    public int hashCode ( ) {
        return Objects.hash(id, name);
    }
}

public class Main {

    public static void main (String[] args) {
//        List<String> list1 = new ArrayList<String>();
//        Set<String> set1 = new TreeSet<String>();
//        Set<String> set2 = new HashSet<String>();


        Set<Person> set2 = new HashSet<Person>();
        Person p1 = new Person(1, "Peter");
        Person p2 = new Person(2, "Hoss");
        Person p3 = new Person(3, "marvin");
        Person p4 = new Person(4, "Thomas");
        Person p5 = new Person(1, "Peter");


//        Set<String> set3 = new LinkedHashSet<String>();
//
//        list1.add("peter");
//        list1.add("Adrian");
//        list1.add("Michi");
//        list1.add("peter");
//        list1.add("Benrt");
////TreeSet
//        set1.add("peter");
//        set1.add("Adrian");
//        set1.add("Michi");
//        set1.add("peter");
//        set1.add("Benrt");
////HashSet
//        set2.add("peter");
//        set2.add("Adrian");
//        set2.add("Michi");
//        set2.add("peter");
//        set2.add("Benrt");

        set2.add(p1);
        set2.add(p2);
        set2.add(p3);
        set2.add(p4);
        set2.add(p5);
        for (Person person: set2) {
            System.out.println(person);
        }

////LinkedHashSet
//        set3.add("peter");
//        set3.add("Adrian");
//        set3.add("Michi");
//        set3.add("peter");
//        set3.add("Benrt");
//
//        System.out.println("Ausgabe ArrayList: ");
//        Main.getElement(list1);
//
//
//
//        System.out.println("\nAusgabe TreeList: ");
//        Main.getElement(set1);
//
//        System.out.println("\nAusgabe HashSet: ");
//        Main.getElement(set2);
//
//        System.out.println("\nAusgabe LinkedHashSet: ");
//        getElement(set3);
//    }
//    public static  void getElement(Collection<String> collection){
//        for (String string: collection) {
//            System.out.println(string);
//        }
//
    }
}
