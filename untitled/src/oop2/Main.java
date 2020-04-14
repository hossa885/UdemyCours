package oop2;

public class Main {

    public static void main(String[] args){

        Mainboard mainboardAsus = new Mainboard(4,2,4);
        Computer computerPeter = new Computer("intel", mainboardAsus, 400);
        System.out.println(computerPeter.mainboard.usbPorts);

        Computer computerOlga = new Computer(2,1,2, "AMD");
        System.out.println(computerOlga.mainboard.ramSlot);


    }
}
