package singelLinkedList;

/*
 Interface, "kontrakt" med metoder som ska kunna utföras av listobjekt
 *Add *Remove
*/
public interface ListInterface {

    void add(int index, Object item) throws ListIndexOutOgBoundsException;
    Object get(int index) throws ListIndexOutOgBoundsException;
    boolean isEmpty();
    void remove(int index) throws ListIndexOutOgBoundsException;
    void removeAll();
    int size();

    /*
    Lokaliserar en viss nod i en länkad lista
    Precondition: Index är indexnummer på önskad nod Anta att 1<= index <= numItems + 1
    Postcondition: Returnerar en referens till den önskade noden
    */
    Node find(int index);
}
