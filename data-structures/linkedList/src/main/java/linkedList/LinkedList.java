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
    private void setHead(Node h) { this.head = h; }



/****************
 * Insert
 *
 * This method takes a value, creates a new Node, and sets that Node at the head of the linked list.
 * */
    public void insert(int v) {
        Node node = new Node(v);
        this.setHead(node);
        this.setSize();
    }



/****************
 * Include
 *
 * This method takes a value and returns a boolean depending whether that value exists.
 * */
    public boolean includes(int v) {
        return false;
    }

}
