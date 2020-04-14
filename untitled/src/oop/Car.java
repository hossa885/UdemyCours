package oop;

import javax.swing.*;

public class Car {
    private String maker;
    private int model;
    private static int no_of_objects;

    public Car(){
        System.out.println("Maker = Hos and model 2020");
        no_of_objects ++;
    }

    public Car(String maker, int model) {
        this.maker = maker;
        this.model = model;
        no_of_objects ++;
        System.out.println("marker: " + maker + " , "+  "model; " + model);
    }

    public static int getNo_of_objects() {
        return no_of_objects;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        if (maker == "Toyota" || maker == "Honda" || maker == "Mercedes")
            this.maker = maker;
        else
            System.out.println("invaled maker");
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        if (model > 2018) {
            this.model = model;

        } else
            System.out.println("invalid model");
    }
}
