package Interface;

public class Main {

    public static void main(String[] args){
//        CD cd1 = new CD();
//        cd1.getItemPrice();
        RatailItem r1 = new CD();
        r1.getItemPrice();
        r1.setTitel();
        Displayable d = new CD();
        d.display();

    }
}
