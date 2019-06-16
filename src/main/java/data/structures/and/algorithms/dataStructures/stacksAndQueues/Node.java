package data.structures.and.algorithms.dataStructures.stacksAndQueues;

public class Node {
/************
 * Instance Variables
 * */
    private Object value;
    private Node next;


/************
 * Constructors
 * */
    public Node(Object v) { this.value = v; }


/************
 * Getters/Setters
 * */
    public Object getValue() { return this.value; }
    public Node getNext() { return this.next; }

    public void setValue(Object v) { this.value = v; }
    public void setNext(Node n) { this.next = n; }


/************
 * Additional Instance Methods
 * */


}
