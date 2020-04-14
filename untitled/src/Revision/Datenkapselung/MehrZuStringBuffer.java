package Revision.Datenkapselung;

public class MehrZuStringBuffer {
    public static void main(String[] args){

        StringBuffer toStringBuffer = new StringBuffer("Hallo");

        System.out.println(toStringBuffer);
        toStringBuffer.append(", Wilkommen in meinem kurs");
        System.out.println(toStringBuffer);
        toStringBuffer.setCharAt(11, 'H');
        System.out.println(toStringBuffer);
    }
}
