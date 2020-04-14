package Revision.Rev2;

public class Main {

    public static void main(String[] args){

        int summe = 100;
        for (int i = 0; i<10; i++){
            int j = i+1;
            System.out.println(j);
        }

        errechne();

        KlasseOne aKlasseOne = new KlasseOne();
        aKlasseOne.a = 100;
        System.out.println(KlasseOne.b);
    }
    public static void errechne(){
        int zahl1 = 50;
        int zahl2 = 50;

        System.out.println("Summe " + (zahl1 +zahl2));
    }
}
