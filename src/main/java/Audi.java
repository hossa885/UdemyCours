public class Audi extends Auto {

    boolean quattro;

    public Audi(int ps, int tuerenAnzahl, String fahrzeugTyp, boolean quatrro){
        super("Audi", ps, tuerenAnzahl, fahrzeugTyp);
        this.quattro = quattro;
    }

    @Override
    public void starten() {
        super.starten();
        System.out.println("Ja und zwar ein Audo startet");
    }
}
