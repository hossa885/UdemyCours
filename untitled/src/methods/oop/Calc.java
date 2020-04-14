package methods.oop;

public class Calc {

    double n1;
    double n2;
    double result;

    public Calc(){
        System.out.println("** New From Calc **");
    }

    public Calc(double number1, double number2){
        System.out.println("** New From Calc **");
        n1 = number1;
        n2 = number2;
    }


    public double add(){
        result = n1+n2;
        return result;
    }
    public double Sub(){
        result = n2 - n1;
        return result;
    }

    public double Multi(){
        result = n2 * n1;
        return result;
    }
    public double Div(){
        if (n2 == 0) return n2 = 1;
        result = n1 / n2;
        return result;
    }
}
