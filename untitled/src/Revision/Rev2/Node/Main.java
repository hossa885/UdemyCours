package Revision.Rev2.Node;

public class Main {

    public static void main(String[] args){
        Liste liste = new Liste();
        liste.addNewElement("ich bin der zweite in der Liste");
        liste.addNewElement("ich bin der dritte in der Liste");
        liste.addNewElement("ich bin der vierte in der Liste");
        liste.addNewElement("ich bin der fünfte in der Liste");

        liste.writeList();
        System.out.println("----------------");

        liste.addNewElement("Peter");
        liste.find("Peter");

        System.out.println("----------------");

        liste.writeList();
        liste.delete("Peter");
        liste.writeList();

        System.out.println("----------------");

        liste.delete("ich bin der fünfte in der Liste");
        liste.writeList();
    }
}
