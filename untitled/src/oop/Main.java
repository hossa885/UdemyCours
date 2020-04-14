package oop;

public class Main {
    public static void main(String[] args){

//        Rectangle rect1 = new Rectangle();
////        rect1.setLength(5);
////        rect1.setWidth(10.5);
////
////
////        Rectangle rect2 = new Rectangle();
////        rect2.setLength(10);
////        rect2.setWidth(15.5);

        Car c1 = new Car();
//        c1.setMaker("Honda");
//        c1.setModel(2020);
//
//
        Car c2 = new Car();
//        c2.setMaker("Toyota");
//        c2.setModel(2019);

        Car c3 = new Car();
        Car c4 = new Car("kia", 2000);

        System.out.println("number of cars is: "+Car.getNo_of_objects());


    }
}
