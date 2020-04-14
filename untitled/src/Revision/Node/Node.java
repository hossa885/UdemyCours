package Revision.Node;

public class Node {

    String string;

    Node nextElement;

    public Node (String string) {
        this.string = string;
        nextElement=null;
    }
    public void setNextElement(Node nextElem){
        this.nextElement = nextElem;

    }


}
