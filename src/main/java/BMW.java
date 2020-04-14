public class BMW {

    private final Auto auto;
    boolean xDrive;

    public BMW( int ps, int tuerenAnzahl, String fahrzeugTyp, boolean xDrive){
        auto = new Auto("BMW", ps, tuerenAnzahl, fahrzeugTyp);
        this.xDrive = xDrive;

    }


    public void starten() {
        //super.start();
        System.out.println("Nämlich der BMV startet");
    }
}

