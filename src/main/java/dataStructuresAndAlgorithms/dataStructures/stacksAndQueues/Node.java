package dataStructuresAndAlgorithms.dataStructures.stacksAndQueues;

public class Node<T> {
/************
 * Instance Variables
 * */
    private T value;
    private Node next;


/************
 * Constructors
 * */
    public Node(T value) { this.value = value; }


/************
 * Getters/Setters
 * */
    public T getValue() { return this.value; }
    public Node getNext() { return this.next; }

    public void setValue(T value) { this.value = value; }
    public void setNext(Node n) { this.next = n; }


/************
 * Additional Instance Methods
 * */


}
