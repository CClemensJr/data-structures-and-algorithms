package linkedList;

public class LinkedList {
/****************
 * Instance Variables
 * */
    private int size;
    private Node head;


/****************
 * Constructors
 * */
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }


/****************
 * Getters & Setters
 * */
    public int getSize() { return size; }
    public Node getHead() { return head; }

    private void setSize() { this.size++; }
    private void setHead(Node h) { this.head = h; }



/****************
 * Insert
 *
 * This method takes a value, creates a new Node, and sets that Node at the head of the linked list.
 * */
    public void insert(int v) {
        try {
            Node node = new Node(v);

            node.setNext(this.head);
            this.setHead(node);
            this.setSize();

        } catch(Exception e) {
            System.err.println("An error has occurred: " + e);
            System.err.println("Press any key to exit...");
            System.console().readLine();
            System.exit(1);
        }
    }



/****************
 * Includes
 *
 * This method takes a value and returns a boolean depending whether that value exists.
 * */
    public boolean includes(int v) {
        try {
            Node current = this.getHead();

            while (current.getNext() != null) {
                if (current.getValue() == v) return true;

                current = current.getNext();
            }

            return (current.getValue() == v) ? true : false;

        } catch(Exception e) {
            System.err.println("An error has occurred: " + e);
            System.err.println("Press any key to exit...");
            System.console().readLine();
            System.exit(1);

        }

        return false;
    }



/****************
 * Print
 *
 * This method returns a list of all nodes in the linked list.
 * */
    public int[] print() {
        try {
            Node current = this.getHead();
            int[] allNodes = new int[this.getSize()];
            int i = 0;

            while (current != null) {
                allNodes[i] = current.getValue();

                i++;
                current = current.getNext();
            }

            return allNodes;

        } catch(Exception e) {
            System.err.println("An error has occurred: " + e);
            System.err.println("Press any key to exit...");
            System.console().readLine();
            System.exit(1);
        }

        return null;
    }
}
