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

    public void setRoot(T value) { this.root = new Node(value); }


/***************
 * Instance Methods
 * */
    public void addNode(T value) {
        try {
            if (this.root == null) { this.root = new Node(value); }
            else if (this.root.getLeftChild() == null) { this.root.setLeftChild(value); }
            else if (this.root.getRightChild() == null) { this.root.setRightChild(value); }
        } catch(Exception e) {
            System.out.println("An error has occurred: " + e);
        }
    }
}
