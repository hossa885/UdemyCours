package Zusammenfassung;

public class Angestellter {
    private int id;
    private String name;
    private int geburtsjahr;

    public Angestellter (int id, int geburtsjahr, String name) {
        this.id = id;
        this.geburtsjahr = geburtsjahr;
        this.name = name;

    }

    public int getId ( ) {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getGeburtsjahr ( ) {
        return geburtsjahr;
    }

    public void setGeburtsjahr (int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    @Override
    public String toString ( ) {
        return "Angestellter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", geburtsjahr=" + geburtsjahr +
                '}';
    }
}
