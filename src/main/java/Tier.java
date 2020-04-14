public class Tier {
    String name;
    int gewicht;
    int groeße;

    public Tier(String name, int groeße, int gewicht){
        this.name = name;
        this.groeße = groeße;
        this.gewicht = gewicht;
    }

    public void essen(){
        System.out.println( "das Tier hat gegessen");

    }
}
