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
        //this.front = null;
        //this.rear = null;
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
    // The enqueue method takes any value as an argument and adds a new node with that value to the back of the queue
    // with an O(1) Time performance
    public void enqueue(Object value) {
        Node node = new Node(value);

        if (this.getFront() == null) {
            this.setFront(node);
            this.setRear(node);
        } else {
            getRear().setNext(node);
            setRear(node);
        }

        setSize(1);
    }

    // The dequeue method does not take any argument, removes the node from the front of the queue, and returns the node’s value.
    public Object dequeue() {
        Node temp = getFront();

        setFront(getFront().getNext());
        temp.setNext(null);
        setSize(-1);

        return temp.getValue();
    }

    // The peek method does not take an argument and returns the value of the node located in the front of the queue,
    // without removing it from the queue
    public Object peek() { return getFront(); }
}
