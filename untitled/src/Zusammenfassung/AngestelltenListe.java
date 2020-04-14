package Zusammenfassung;

import java.util.*;

class SortiereAngestelltenID implements Comparator<Angestellter> {
    @Override
    public int compare (Angestellter o1, Angestellter o2) {

        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() < o2.getId()) {
            return -1;
        }else{
            return 0;
        }
    }
}

class SortiereAngesteltenNamen implements Comparator<Angestellter> {
    @Override
    public int compare (Angestellter o1, Angestellter o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortiereAngestelltenGeburtsjahr implements Comparator<Angestellter> {
    @Override
    public int compare (Angestellter o1, Angestellter o2) {
        if (o1.getGeburtsjahr() > o2.getGeburtsjahr()) {
            return 1;
        } else if (o1.getGeburtsjahr() < o2.getGeburtsjahr()) {
            return -1;
        }else{
            return 0;
        }
    }
}

public class AngestelltenListe {

    public static void main (String[] args) {

        List<Angestellter> angestellterList = new ArrayList<>();

        AngestelltenListe.addAngestellter(3, angestellterList);

        Collections.sort(angestellterList, new SortiereAngestelltenID());
//        Collections.sort(angestellterList, new SortiereAngesteltenNamen());
//        Collections.sort(angestellterList, new SortiereAngestelltenGeburtsjahr());

        AngestelltenListe.getAngestellter(angestellterList);
        Set<Angestellter> set1 = new TreeSet<>(new SortiereAngestelltenID() );
        Map<Angestellter, String> map1 = new TreeMap<>(new SortiereAngestelltenGeburtsjahr());
    }

    public static void addAngestellter (int anzahl, Collection<Angestellter> col) {

        for (int i = 1; i <= anzahl; i++) {
            Scanner scanAngestellter = new Scanner(System.in);
            System.out.println("bitte Namen eintippen: ");
            String name = scanAngestellter.next();
            System.out.println("Bitte id eintippen; ");
            int id = scanAngestellter.nextInt();
            System.out.println("Bitte geburtsjahr eintippen; ");
            int geburtsjahr = scanAngestellter.nextInt();

            Angestellter angestellter = new Angestellter(id, geburtsjahr, name);
            col.add(angestellter);


        }
    }

    public static void getAngestellter (Collection<Angestellter> col) {
        for (Angestellter angestellter : col) {
            System.out.print("Angestellter: ");
            System.out.println(angestellter);

        }
    }
}
