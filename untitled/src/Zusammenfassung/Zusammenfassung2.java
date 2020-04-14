package Zusammenfassung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class VergleicheStringLaenge implements Comparator<String> {

    @Override
    public int compare (String o1, String o2) {

        int laenge1 = o1.length();
        int lanege2 = o2.length();

        if (laenge1 > lanege2) {
            return 1;
        } else if (laenge1 < lanege2) {
            return -1;
        } else {
            return 0;
        }

        // Comparator = Vergleicher
        // 0 = Beide gleich
        // 1 = o1 > o2
        // -1 = o1 < o2
    }
}

class UmgekehrtAphapetischeReihnfolgeString implements Comparator<String> {

    @Override
    public int compare (String o1, String o2) {
        return -(o1.compareTo(o2));
    }
}

public class Zusammenfassung2 {

    public static void main (String[] args) {

        // Comparator = Vergleicher

        List<String> angestelltenListe = new ArrayList<>();
        angestelltenListe.add("Hans");
        angestelltenListe.add("Bernd");
        angestelltenListe.add("And");
        angestelltenListe.add("Petra");
        angestelltenListe.add("Peter");
        angestelltenListe.add("Christian");

        Collections.sort(angestelltenListe, new UmgekehrtAphapetischeReihnfolgeString());

//        for (String string : angestelltenListe) {
//
//            System.out.println(string);
//        }


    }
}
