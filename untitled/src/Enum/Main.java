package Enum;

public class Main {
    public static void main(String[] args){
        Course c1 = Course.Math;
        Course c2 = Course.Database;
//        System.out.println(c1.toString());
////        System.out.println(c1.ordinal());
        System.out.println(c2.equals(c1));
        System.out.println(c1.compareTo(c2));
    }
}
