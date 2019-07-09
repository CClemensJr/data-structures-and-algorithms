package dataStructuresAndAlgorithms.dataStructures.hashtable;

public class Node {
/****************
 * Instance Variables
 * */
    private String key;
    private String value;
    private Node next;


/****************
 * Constructors
 * */
    public Node () {}

    public Node (String key, String value) {
        this.key = key;
        this.value = value;
    }


/****************
 * Getters/Setters
 * */
    public String getKey() { return this.key; }
    public void setKey(String key) { this.key = key; }

    public String getValue() { return this.value; }
    public void setValue(String value) { this.value = value; }

    public Node getNext() { return this.next; }
    public void setNext(Node next) { this.next = next; }
}
