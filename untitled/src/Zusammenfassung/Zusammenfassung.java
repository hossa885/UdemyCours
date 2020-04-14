package Zusammenfassung;

import org.jetbrains.annotations.NotNull;

import java.util.*;

class  Person implements Comparable<Person>{
    private String vorName;

    public Person(String vorName){
        this.vorName = vorName;

    }

    @Override
    public String toString ( ) {
        return "Person{" +"vorName='" + vorName + '\'' + '}';
    }

//    @Override
//    public int compareTo (@NotNull Person o) {
//        return vorName.compareTo(o.vorName);
//    }

    @Override
    public int compareTo (@NotNull Person o) {
        int Laenge1 = vorName.length();
        int laenge2 = o.vorName.length();
        if (Laenge1 > laenge2){
            return -1;
        }else if (Laenge1 < laenge2){
            return 1;
        }else{
            return vorName.compareTo(o.vorName);
        }
    }

    // 0 = Beide gleich
    // 1 = Objekt ist größer
    // -1 = Objekt ist kleiner

}




public class Zusammenfassung {



    public static void main(String[] args){
        System.out.println("LIST: -------------------");
        List<Person> list = new ArrayList<>();
        Zusammenfassung.addElements(3, list);
        Collections.sort(list);
        Zusammenfassung.getElement(list);



        System.out.println("SET: -------------------");
        Set<Person> set = new TreeSet<>();
        Zusammenfassung.addElements(5, set);
        Zusammenfassung.getElement(set);
//        System.out.println("MAP: -------------------");
//        Map<Integer, String> map= new TreeMap<>();
//        map.put(4, "Katze");
//        map.put(2, "Hund");
//        map.put(1, "Kaninchen");
//        map.put(3, "Aal");
//
//        for (Integer key: map.keySet() ) {
//            System.out.println("Key: " + key + " Inhalt: " + map.get(key));
//        }
//
//
//
    }
    public static void addElements(int anzahlPerson, Collection<Person> col){
        for (int i = 1; i <= anzahlPerson; i++ ) {
        Scanner scanName = new Scanner(System.in);
        System.out.println("Name eingeben");
        String eingabeName = scanName.next();
        Person person = new Person(eingabeName);
        col.add(person);


        }

    }
    public static void getElement(Collection<Person> col){
        for (Person person: col ) {
            System.out.print("Name der Peron");
            System.out.print(person);

        }
    }
}
