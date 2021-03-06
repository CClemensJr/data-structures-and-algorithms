package dataStructuresAndAlgorithms.dataStructures.stacksAndQueues;

public class Queue<T> {
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
    public void setRear(Node r) { this.rear = r; }
    public void setSize(int s) { this.size = (s == 1) ? this.size + 1 : this.size - 1; }


/************
 * Additional Instance Methods
 * */
    // The enqueue method takes any value as an argument and adds a new node with that value to the back of the queue
    // with an O(1) Time performance
    public void enqueue(T value) {
        try {
            Node node = new Node(value);

            if (getFront() == null) {
                setFront(node);
                setRear(node);
            } else {
                getRear().setNext(node);
                setRear(node);
            }

            setSize(1);

        } catch(Exception e) {

            System.err.println("An error has occurred: " + e);
        }
    }

    // The dequeue method does not take any argument, removes the node from the front of the queue, and returns the node’s value.
    public T dequeue() {
        try {
            Node temp = getFront();

            setFront(getFront().getNext());
            temp.setNext(null);
            setSize(-1);

            return (T) temp.getValue();

        } catch(Exception e) {

            System.err.println("An error has occurred: " + e);
        }

        return null;
    }

    // The peek method does not take an argument and returns the value of the node located in the front of the queue,
    // without removing it from the queue
    public T peek() {
        try {

            return (T) getFront().getValue();

        } catch(Exception e) {

            System.err.println("An error has occurred: " + e);
        }

        return null;
    }
}
