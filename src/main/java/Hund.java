public class Hund extends Tier {

        int zaehne;

    @Override
    public void essen() {
        System.out.println("Der Hund muss sein Essen kauen");
        super.essen();
    }

    public Hund(String name, int groeße, int gewicht, int zaehne){
        super(name, groeße, gewicht);
        this.zaehne = zaehne;



    }

}
