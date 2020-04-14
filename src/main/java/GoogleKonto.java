import java.util.Scanner;

public class GoogleKonto{

    //eigenschaften / Attribute

    private String benutzername;
    private String passwort;

    // Konstrukto

    public GoogleKonto(String benutzername, String passwort){
        this.benutzername = benutzername;
        this.passwort = passwort;
    }

    // Methoden

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        if (passwort.equals(this.passwort)){
            System.out.println("passwrot stimmt kann geändert werden");
            System.out.println("bitte neues PW eingeben");
            Scanner scan = new Scanner(System.in);
            String newPw = scan.nextLine();
            this.passwort = newPw;
            System.out.println("das neue Pw lautet " + this.passwort);
        }else{
            System.out.println("Passwort falsch, kann nicht geändert werden");
        }
    }

    public String getBenutzername(){
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }
}
