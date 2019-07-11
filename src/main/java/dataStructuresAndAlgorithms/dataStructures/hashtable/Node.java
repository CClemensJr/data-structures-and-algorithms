package dataStructuresAndAlgorithms.dataStructures.hashtable;

public class Node<T> {
/****************
 * Instance Variables
 * */
    private String key;
    private T value;
    private Node next;


/****************
 * Constructors
 * */
    public Node () {}

    public Node (String key, T value) {
        this.key = key;
        this.value = value;
    }


/****************
 * Getters/Setters
 * */
    public String getKey() { return this.key; }
    public void setKey(String key) { this.key = key; }

    public T getValue() { return this.value; }
    public void setValue(T value) { this.value = value; }

    public Node getNext() { return this.next; }
    public void setNext(Node next) { this.next = next; }
}
