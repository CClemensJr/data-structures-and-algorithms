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
    public void setSize() { this.size++; }


/************
 * Additional Instance Methods
 * */
    // The push method takes any value as an argument and adds a new node with that value to the top of the stack with
    // an O(1) Time performance.
    public void push(Object value) { this.top = new Node(value); }



}
