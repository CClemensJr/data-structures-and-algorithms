package data.structures.and.algorithms.dataStructures.linkedList;

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

    public void setValue(int v) { this.value = v; }
    public void setNext(Node n) { this.next = n; }
}
