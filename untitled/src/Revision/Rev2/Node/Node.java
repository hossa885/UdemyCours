package Revision.Rev2.Node;

public class Node {
    // Information des Knotens
    String string;
    // Die referenz (Adresse) vom Nachbarn
    Node nextElement;
    //Konstruktor
    public Node(String string){
        this.string = string;
        nextElement = null;

    }

    //Setzte einen Nachbarn
    public void setNextElement(Node nextElement){
        this.nextElement=nextElement;
    }

    //erhalte den Nachbarn

    public Node getNextElement(){
        return nextElement;

    }
    //erhalte die Information des Knotens
    public String getString(){
        return string;
    }



}
