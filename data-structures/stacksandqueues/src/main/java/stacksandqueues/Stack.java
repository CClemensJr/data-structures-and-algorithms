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
        try {
            Node node = new Node(value);

            node.setNext(getTop());
            setTop(node);
            setSize(1);

        } catch (Exception e) {

            System.err.println("An error has occurred: " + e);
        }
    }


    // The push method does not take any argument, removes the node from the top of the stack, and returns the node’s value.
    public Object pop() {
        try {
            Node temp = getTop();

            this.setTop(this.getTop().getNext());
            this.setSize(-1);

            temp.setNext(null);

            return temp.getValue();

        } catch (Exception e) {

            System.err.println("An error has occurred: " + e);
        }

        return null;
    }


    // The peek method does not take an argument and returns the value of the node located on top of the stack, without
    // removing it from the stack
    public Object peek() {
        try {

            return this.getTop().getValue();

        } catch (Exception e) {

            System.err.println("An error has occurred: " + e);
        }

        return null;
    }

}
