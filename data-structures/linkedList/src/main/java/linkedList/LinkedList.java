package linkedList;

public class LinkedList {
/****************
 * Instance Variables
 * */
    private int size;
    private Node head;
    private Node foot;


/****************
 * Constructors
 * */
    public LinkedList() {
        this.head = null;
        this.foot = null;
        this.size = 0;
    }


/****************
 * Getters & Setters
 * */
    public int getSize() { return size; }
    public Node getHead() { return head; }
    public Node getFoot() { return foot; }

    private void setSize() { this.size++; }
    private void setHead(Node h) { this.head = h; }
    private void setFoot(Node f) { this.foot = f; }


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

            this.setFoot(current);

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
                if (current.getNext() == null) this.setFoot(current);

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



/****************
 * Append
 *
 * This method adds a new node to the end of the linked list.
 * */
    public void append(int v) {
        try {
            Node current = this.getHead();
            Node node = new Node(v);

            while (current != null) {
                if (current.getNext() == null) {
                    current.setNext(node);

                    current = current.getNext();

                    this.setFoot(current);
                }

                current = current.getNext();
            }

        } catch(Exception e) {
            System.err.println("An error has occurred: " + e);
            System.err.println("Press any key to exit...");
            System.console().readLine();
            System.exit(1);
        }
    }


/****************
 * InsertBefore
 *
 * This method takes a old value and a new value then inserts a Node with the new value before the node with the old value.
 * */
    public void insertBefore(int v, int newValue) {
        try {
           if (this.getHead().getValue() == v) {
               this.insert(newValue);
           } else {
               Node current = this.getHead();
               Node newNode = new Node(newValue);

               while (current.getNext() != null) {
                   if (current.getNext().getValue() == v) {
                       newNode.setNext(current.getNext());
                       current.setNext(newNode);

                       break;
                   }

                   current = current.getNext();
               }

               this.setFoot(current);
           }

        } catch(Exception e) {
            System.err.println("An error has occurred: " + e);
            System.err.println("Press any key to exit...");
            System.console().readLine();
            System.exit(1);
        }
    }


/****************
 * InsertAfter
 *
 * This method takes a old value and a new value then inserts a Node with the new value after the node with the old value.
 * */
    public void insertAfter(int v, int newValue) {
        try {
            if (this.getFoot().getValue() == v) {
                this.append(newValue);
            } else {
                Node current = this.getHead();
                Node newNode = new Node(newValue);

                while (current != null) {
                    if (current.getNext() == null) this.setFoot(current);

                    if (current.getValue() == v) {
                        newNode.setNext(current.getNext());
                        current.setNext(newNode);
                    }

                    current = current.getNext();
                }
            }
        } catch(Exception e) {
            System.err.println("An error has occurred: " + e);
            System.err.println("Press any key to exit...");
            System.console().readLine();
            System.exit(1);
        }
    }



/****************
 * KthFromTheEnd
 *
 * This method takes a value k and returns the node that is kth from the end of the linked list
 * */
    public int kthNodeFromTheEnd(int k) {

        return 0;
    }

}
