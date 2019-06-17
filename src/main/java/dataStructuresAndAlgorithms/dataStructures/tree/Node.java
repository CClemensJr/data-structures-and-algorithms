package dataStructuresAndAlgorithms.dataStructures.tree;

public class Node<T> {
/***************
 * Instance Variables
 * */
    private T value;
    private Node leftChild;
    private Node rightChild;


/***************
 * Constructors
 * */
    public Node(T value) {
        this.value = value;
    }


/***************
 * Getters / Setters
 * */
    public T getValue() { return this.value; }
    public Node getLeftChild() { return this.leftChild; }
    public Node getRightChild() { return this.rightChild; }
}
