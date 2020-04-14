package Revision.Datenkapselung;

public class MehrZuString {
    public static void main(String[] args){
        String string = "H,a,l,l,o";
        String string2 = new String("Hallo");

        String passwort = "123456";
        String eingabeUser = "123456";
        string.replace(',', '.');

        if (passwort.equals(eingabeUser)){
            System.out.println("Loginerfolgreich");
        }else {
            System.out.println("Falsches Passwwort");
        }

        System.out.println(passwort.length());



    }
}
