package Array.Aufgabe;

public class Kontakt {
        private String name;
        private String telefonNummer;

        public Kontakt(String name, String telefonnummer){
            this.name= name;
            this.telefonNummer= telefonnummer;

        }

    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getTelefonnummer ( ) {
        return telefonNummer;
    }

    public void setTelefonnummer (String telefonnummer) {
        this.telefonNummer = telefonnummer;
    }

    public static Kontakt erstelleKontakt(String name, String telefonNummer){
            return new Kontakt(name, telefonNummer);

    }
}
