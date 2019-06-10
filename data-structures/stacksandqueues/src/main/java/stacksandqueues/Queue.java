package stacksandqueues;

public class Queue {
/************
 * Instance Variables
 * */
    private Node front;
    private Node rear;
    private int size;


/************
 * Constructors
 * */
    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }


/************
 * Getters/Setters
 * */
    public Node getFront() { return this.front; }
    public Node getRear() { return this.rear; }
    public int getSize() { return this.size; }

    public void setFront(Node f) { this.front = f; }
    public void setRear(Node r) { this.front = r; }
    public void setSize(int s) { this.size = (s == 1) ? this.size + 1 : this.size - 1; }


/************
 * Additional Instance Methods
 * */
}
