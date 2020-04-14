package oop3;

import oop.Car;

public class Main {
    public static void main(String[] args) {

//        Rectangle rect1 = new Rectangle();
////        rect1.setLength(5);
////        rect1.setWidth(10.5);
////
////
////        Rectangle rect2 = new Rectangle();
////        rect2.setLength(10);
////        rect2.setWidth(15.5);

//       Rectangle room1 =  new Rectangle();
//       double roomLength = 50;
//       room1.setLength(roomLength);
//       System.out.println(roomLength);
//
      /*
        Rectangle room3 = new Rectangle();
        Rectangle myInputObject = new Rectangle(10,30);

        room3.modifier(myInputObject);

        System.out.println(myInputObject.getLength());
        System.out.println(myInputObject.getWidth());
*/
       /* Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(20,30);

        System.out.println(r1.add(r2).getLength());
        System.out.println(r1.add(r2).getWidth());
*/

        Rectangle r1 = new Rectangle(10,50);
        Rectangle r2 = new Rectangle(r1);

        System.out.println("The length is: " + r2.getLength());

        System.out.println("The width is: " + r2.getWidth());
//        r2=r1;
//        if (r1==r2){
//            System.out.println("The Objects are equal");
//        }else
//            System.out.println("The objects are different");
        //
//        if (r1.isEqual(r2)){
//            System.out.println("The Objects are equal");
//        }else
//            System.out.println("The objects are different");




    }
}
