package methods.oop;

public class StringTool {
    String text;
    private String inversetext;
    String texts[];

    public StringTool(String text) {
        this.text = text;
    }

    public StringTool(String texts[]){
        this.texts = texts;

    }

    public void printCharByChar() {
        for (char c : text.toCharArray()){
            System.out.println(c);
        }
    }

    public void printCharByCharInverse(){
        StringBuilder sb = new StringBuilder(text);
        inversetext = sb.reverse().toString();
        for(char c: inversetext.toCharArray()){
            System.out.println(c);
        }

    }

    public void printStringArray(){
        for(String s: texts){
            System.out.println(s);
        }
    }
}
