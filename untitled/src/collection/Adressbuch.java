package collection;

import java.util.ArrayList;
import java.util.Scanner;


public class Adressbuch {
    public static void main (String[] args) {

        Adresse peterAdresse = new Adresse("Peter", "Fritzlangen.4", "Berlin");
        Adresse hansAdresse = new Adresse("Hans", "Tarnowitzer weg 4", "Hamburg");
        Adresse michaelAdresse = new Adresse("Michael", "Leipzigerstrasse 5", "Leipzig");

        ArrayList<Adresse> adressenListe = new ArrayList<Adresse>();
        Adresse[] adressenArray = {peterAdresse, hansAdresse, michaelAdresse};
        adressenListe.add(peterAdresse);
        adressenListe.add(hansAdresse);
        adressenListe.add(michaelAdresse);

        Scanner scanner = new Scanner(System.in);
        String  name = scanner.nextLine();
        String  strasse = scanner.nextLine();
        String  stadt = scanner.nextLine();


        Adresse adresse4 = new Adresse(name, strasse, stadt);
        adressenListe.add(adresse4);
//
//
//        adressenArray[3] = adresse4;


        for (Adresse adresse : adressenListe) {
            System.out.println("Name " + adresse.getName() + ", Strasse: " + adresse.getStrasse() + ", Stadt: " + adresse.getStadt());

        }
        for (Adresse adresse : adressenArray) {
            System.out.println("Name " + adresse.getName() + ", Strasse: " + adresse.getStrasse() + ", Stadt: " + adresse.getStadt());
        }


    }
}
