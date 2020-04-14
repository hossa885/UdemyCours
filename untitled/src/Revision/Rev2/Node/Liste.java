package Revision.Rev2.Node;

public class Liste {

    //Strat Knoten der Liste

    Node startElem = new Node("Anfang der Liste");
    //Konstruktor der Liste
    public Liste(){

    }
    //Füge einen Knoten in der Liste hinzu
    public void addNewElement(String string){
        Node newElem= new Node(string);
        Node lastElem= getLastElem();
        lastElem.setNextElement(newElem);
    }

    //Erhalten das Letzte Element einer Liste
    public Node getLastElem(){
        Node le = startElem;
        while (le.getNextElement() != null){
            le = le.getNextElement();

        }
        return le;

    }

    public void writeList(){
        Node le = startElem;
        while(le !=null){
        System.out.println(le.getString());
        le = le.getNextElement();
        }
    }

    //Suche einen Knoten
    public void find(String string){
        Node le = startElem;
        while(le !=null){
            if (le.getString().equals(string)){
                System.out.println("Objekt gefunden: " + le.getString());
                break;
            }else{
                le = le.nextElement;
                System.out.println("Objekt " + string + " nicht gefunden");
            }
        }

    }
    public void delete(String string){
        Node le= startElem;
        while (le.getNextElement() != null && !le.getString().equals(string)){
            if(le.getNextElement().getString().equals(string)){
                if (le.getNextElement().getNextElement() != null){
                    le.setNextElement(le.getNextElement().getNextElement());
                }else{
                    le.setNextElement(null);
                    break;
                }
            }
            le = le.getNextElement();
        }
    }

}
