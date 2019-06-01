package linkedList;

public class LinkedList {
/****************
 * Instance Variables
 * */
    private int size;
    private Node head;


/****************
 * Constructors
 * */
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }


/****************
 * Getters & Setters
 * */
    public int getSize() { return size; }
    public Node getHead() { return head; }

    private void setSize() { this.size++; }
    public void setHead(int v) { this.head.setValue(v); }



/****************
 * Getters
 * */
    public void insert(int v) {


    }
}
