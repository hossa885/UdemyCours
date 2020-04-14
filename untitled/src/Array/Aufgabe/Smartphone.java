package Array.Aufgabe;

import java.util.*;

public class Smartphone {
    private List<Kontakt> meineKontakte;

    public Smartphone ( ) {
        meineKontakte = new ArrayList<Kontakt>();
    }

    public boolean addKontakt (Kontakt neuerKontakt) {
        for (Kontakt kontaktInListe : meineKontakte) {
            if (neuerKontakt.getName().equals(kontaktInListe.getName())) {
                System.out.println("Kontakt bereits vorhanden");
                return false;

            }

        }
        meineKontakte.add(neuerKontakt);
        System.out.println("Kontakt wird hinzugefügt");
        return true;
    }

    public boolean findKontakt (String name) {
        for (Kontakt kontaktInListe : meineKontakte) {
            if (name.equals(kontaktInListe.getName())) {
                System.out.println("Gefunden..." + "Name: " + kontaktInListe.getName() + " tel: " + kontaktInListe.getTelefonnummer());
                return true;

            }

        }
        System.out.println("Nicht gefunden");
        return false;

    }
    public  void ausgabe(){
        for (Kontakt kontaktInListe: meineKontakte) {
            System.out.println("Name: " + kontaktInListe.getName() + "tel: " + kontaktInListe.getTelefonnummer() );
            
        }
    }
}
