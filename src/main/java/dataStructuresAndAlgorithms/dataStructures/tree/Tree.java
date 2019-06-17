package dataStructuresAndAlgorithms.dataStructures.tree;

public class Tree<T> {
/***************
 * Instance Variables
 * */
    private Node root;


/***************
 * Constructors
 * */
    public Tree() {}

    public Tree(T value) {
        this.root = new Node(value);
    }


/***************
 * Getters / Setters
 * */
    public Node getRoot() { return this.root; }
}
