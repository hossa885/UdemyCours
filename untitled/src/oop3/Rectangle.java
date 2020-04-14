package oop3;


public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(){

    }

    public void modifier(Rectangle r){
        r.length= 67;
        r.width = 98;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        length = 70;
        this.length = length;

    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public Rectangle add(Rectangle room1){
        Rectangle result = new Rectangle();
        result.length= this.length + room1.length;
        result.width = this.width + room1.width;
        return result;
    }

    public boolean isEqual(Rectangle rect){
        if (this.length == rect.length && this.width == rect.width) {
            return true;
        } else
            return false;
    }
    public Rectangle(Rectangle sourceObject){
        this.length = sourceObject.length;
        this.width = sourceObject.width;

    }




}
