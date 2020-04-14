package Java.Taschenrechner.Beispielpaket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Java.Taschenrechner.Beispielpaket.Taschenrechner.plus(1, 2);
//        Java.Taschenrechner.Beispielpaket.Taschenrechner.dividiere(30,0);
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Bitte gebe Zahl 1");
            int userZahl1 = scan.nextInt();

            System.out.println("Bitte gebe Zahl 2");
            int userZahl2 = scan.nextInt();

            Taschenrechner.dividiere(userZahl1, userZahl2);

        } catch (NichtDurchNullTeilenExeption e) {
            System.out.println(" Mann kann nicht durch 0 teilen");
            System.out.println("Bitte gültige Zahl eingeben...");
            int neueEingabe1 = scan.nextInt();
            System.out.println("Bitte gültige Zah2 eingeben...");
            int neueEingabe2 = scan.nextInt();
            System.out.println(e.getMessage());

            try {
                Taschenrechner.dividiere(neueEingabe1, neueEingabe2);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        System.out.println("Programm geht weiter");
    }
}
