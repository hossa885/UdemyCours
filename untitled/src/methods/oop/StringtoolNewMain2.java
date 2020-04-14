package methods.oop;

public class StringtoolNewMain2 {

    public static void main(String[] args){

//        StringTool c = new StringTool("Hello");
//        c.printCharByCharInverse();


//        String str[] = new String[3];
//        str[0] = "Ahmed";
//        str[0] = "Ibrahim";
//        str[0] = "Fawzy";
        String[] str = {"a", "b", "c"};
        StringTool s = new StringTool(str);
        s.printStringArray();
    }
}
