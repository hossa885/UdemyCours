package collection;

public class Adresse {

    // Eigenschaften / Atribute
    private String name;
    private String strasse;
    private String stadt;

    // Konstruktor

    public Adresse ( ) {
    }

    public Adresse (String name, String strasse, String stadt) {
        super();
        this.name = name;
        this.strasse = strasse;
        this.stadt = stadt;
    }

    // Methoden
    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getStrasse ( ) {
        return strasse;
    }

    public void setStrasse (String strasse) {
        this.strasse = strasse;
    }

    public String getStadt ( ) {
        return stadt;
    }

    public void setStadt (String stadt) {
        this.stadt = stadt;
    }



}
