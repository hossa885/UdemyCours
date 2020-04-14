package Revision.Datenkapselung;

public class CountNumber implements Runnable {


    @Override
    public void run ( ) {
        for (int i = 0; i<=200; i++){
            System.out.println("CountNumber: " + i);
        }
    }

    public static void main (String[] args){

        Thread countNumber = new Thread(new CountNumber());
        countNumber.start();

        for (int i = 0; i<=200; i++){
            System.out.println("ThreadTest: " + i);
        }
    }
}
