package oop2;

public class Computer {
    String cpu;
    Mainboard mainboard;
    int preis;

    public Computer(){

    }

    public Computer(String cpu, Mainboard mainboard, int preis){
        this.cpu = cpu;
        this.mainboard = mainboard;
        this.preis = preis;

    }

    public Computer(int ramSlots, int kartenSlots, int usbPort, String cpu){
        mainboard = new Mainboard(ramSlots, kartenSlots, usbPort);
        this.cpu = cpu;
    }
}
