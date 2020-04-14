package BinaerBaum;

public class Tree {
    //root Node
    Node root;

    // konstruktor
    public Tree ( ) {

    }

    //Neues Nod hinzufügen
    public void addNode (int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
        } else {
            Node currentNode = root;
            Node parent;

            while (true) {
                parent = currentNode;

                if (value < currentNode.value) {
                    currentNode = newNode.left;

                    if (currentNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    currentNode = currentNode.right;

                    if (currentNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }

        }
    }

    //Anzahl der Nodes im Baum
    public int countNode (Node r) {
        if (r == null) {
            return 0;
        } else {
            int l = 1;
            l += countNode(r.left);
            l += countNode(r.right);
            return l;
        }
    }

    // Travisierung
    // 1. in Order
    public void inOrderTravers (Node currentNode) {
        if (currentNode != null) {
            inOrderTravers(currentNode.left);
            System.out.println(currentNode.value);
            inOrderTravers(currentNode.right);

        }

    }

    // pr-Order
    public void preOrderTravers (Node currentNode) {
        if (currentNode != null) {
            System.out.println(currentNode.value); //W
            inOrderTravers(currentNode.left);//L
            inOrderTravers(currentNode.right);//R

        }

    }

    //Post-Order
    public void postOrderTravers (Node currentNode) {
        if (currentNode != null) {

            inOrderTravers(currentNode.left);//L
            inOrderTravers(currentNode.right);//R
            System.out.println(currentNode.value); //W

        }

    }

    public Node find (int value) {

        Node currentNode = root;
        if (currentNode == null) {
            return null;
        }
        while (currentNode.value != value) {
            if (value < currentNode.value) {
                currentNode = currentNode.left;


            } else {
                currentNode = currentNode.right;
            }
        }
        return currentNode;
    }


}
