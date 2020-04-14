package Java.Taschenrechner.Beispielpaket;

public class Taschenrechner {
    public static void plus(int userZahl1, int userZahl2) {
        System.out.println("Ergebnis: " + (userZahl1 + userZahl2));
    }

    public static void minus(int userZahl1, int userZahl2) {
        System.out.println("Ergebnis: " + (userZahl1 - userZahl2));

    }

    public static void mal(int userZahl1, int userZahl2) {
        System.out.println("Ergebnis: " + (userZahl1 * userZahl2));

    }

    public static void dividiere(int userZahl1, int userZahl2) throws NichtDurchNullTeilenExeption {
        if (userZahl2 == 0) {
            throw new NichtDurchNullTeilenExeption("Hey darfst nicht keine Null eingeben");
        }else {
            System.out.println("Ergebnis: " + (userZahl1 / userZahl2));
        }

    }

}
