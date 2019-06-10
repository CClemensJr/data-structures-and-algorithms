package stacksandqueues;

public class Stack {
/************
 * Instance Variables
 * */
    private Node top;
    private int size;


/************
 * Constructors
 * */
    public Stack() {
        this.top = null;
        this.size = 0;
    }


/************
 * Getters/Setters
 * */
    public Node getTop() { return this.top; }
    public int getSize() { return this.size; }

    public void setTop(Node t) { this.top = t; }
    public void setSize(int s) { this.size = (s == 1) ? this.size + 1 : this.size - 1; }


/************
 * Additional Instance Methods
 * */
    // The push method takes any value as an argument and adds a new node with that value to the top of the stack with
    // an O(1) Time performance.
    public void push(Object value) {
        setTop(new Node(value));
        setSize();
    }


    // The push method does not take any argument, removes the node from the top of the stack, and returns the node’s value.
    public Object pop() {


    }

}
