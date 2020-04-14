package methods;

import javax.swing.*;
import java.io.PrintWriter;

public class exeption {
    public static void main(String[] args) {
//        try {
//            int a = 5;
//            int b = 2;
//            int c = a / b;
//            System.out.println(c);
//
//        } catch (Exception ex) {
////            System.out.println(ex.getMessage());
//            if (ex.getMessage().contains("/ by zero")) {
//                System.out.println("tezak 7amra");
//            }
//        }
        try {
            PrintWriter w = new PrintWriter("Hossamfile-txt");
            w.println("Welcom");
            w.print("hi hoss");
            w.close();


        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
