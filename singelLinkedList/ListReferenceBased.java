package singelLinkedList;

public class ListReferenceBased extends java.lang.Object implements ListInterface {
    private Node head;
    private int numItems;

    public ListReferenceBased(Node head, int numItems){
        this.head = head;
        this.numItems = numItems;
    }

    @Override
    public Node find(int index){

       Node curr = head;

       for(int skip=1; skip<index; skip++){
           curr = curr.getNext();
       }

        return curr;
    }


    @Override
    public void add(int index, Object item) throws ListIndexOutOgBoundsException {

    }

    @Override
    public Object get(int index) throws ListIndexOutOgBoundsException {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void remove(int index) throws ListIndexOutOgBoundsException {

    }

    @Override
    public void removeAll() {

    }

    @Override
    public int size() {
        return 0;
    }
}
