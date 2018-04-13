package singelLinkedList;
// Hej, Ida. Funkar det här?

//Hej Todd, Detta funkar :D:D
public class Node {

    private Node nextNode;
    private Object newItem;

    public Node(Object newItem)

    public Node(Node nextNode, Object newItem) {
       this.nextNode = nextNode;
       this.data = newItem;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

}
