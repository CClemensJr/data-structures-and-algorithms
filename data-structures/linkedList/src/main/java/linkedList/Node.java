package linkedList;

public class Node {
    // Instance Variables
    private int value;
    private Node next;

    // Constructors
    public Node() {}

    public Node(int v) {
        this.value = v;
    }

    // Getter and Setter methods
    public int getValue() { return value; }
    public Node getNext() { return next; }

    public void setValue() { this.value = value; }
    public void setNext() { this.next = next; }
}
