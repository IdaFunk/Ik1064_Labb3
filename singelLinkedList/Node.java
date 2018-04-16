package singelLinkedList;
// Hej, Ida. Funkar det här?

//Hej Todd, Detta funkar :D:D
public class Node {

    private Node nextNode;
    private Object newItem;

    public Node(Object newItem){
        this.nextNode = nextNode;
    }

    public Node(Node nextNode, Object newItem) {
       this.nextNode = nextNode;
       this.newItem = newItem;
    }


    public Object getNewItem() {
        return newItem;
    }

    public void setNewItem(Object newItem) {
        this.newItem = newItem;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
