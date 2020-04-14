package Array.codingenieur;

import Array.Aufgabe.*;

public class MeineSmartphones {
    public static void main(String[] args){
        Smartphone iPhon6 = new Smartphone();
        iPhon6.addKontakt(Kontakt.erstelleKontakt("Christian", "012345678"));
        iPhon6.addKontakt(Kontakt.erstelleKontakt("Hossam", "012345852"));
        iPhon6.addKontakt(Kontakt.erstelleKontakt("Hans", "0123498"));
        iPhon6.addKontakt(Kontakt.erstelleKontakt("petra", "012345665"));

        Kontakt petra = new Kontakt("petra", "012345665");
        iPhon6.addKontakt(petra);
        iPhon6.ausgabe();

        System.out.println("Suchen: ");
        iPhon6.findKontakt("petra");
    }
}
