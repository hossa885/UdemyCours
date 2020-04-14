package Revision;

public class Methoden {

    public static void main (String[] args) {
//        countIterativ(10, 20);
        countrekursiv(10, 20);

    }

    public static void countIterativ (int zahl, int max) {
        while (zahl <= max) {
            System.out.println("Iterative: " + zahl);
            zahl = zahl + 1;
        }
    }

    public static void countrekursiv (int zahl, int max) {
        if (zahl > max) {
            return;
        }
        System.out.println("Rekursiv: " + zahl);
        countrekursiv(zahl + 1, max);
    }

}
