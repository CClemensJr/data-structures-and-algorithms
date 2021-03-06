package dataStructuresAndAlgorithms.dataStructures.linkedList;

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

            return current.getValue() == v;

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
                    this.setSize();
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
                       this.setSize();

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
                        this.setSize();
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
        if (k > this.getSize() && this.getSize() > 1) throw new IndexOutOfBoundsException("The number provided is larger than the list.");
        if (k == this.getSize() || this.getSize() == 1) return this.getHead().getValue();
        if (k == 0) return this.getFoot().getValue();

        Node current = this.getHead();
        int i = 1;

        while (current != null && i <= (this.getSize() - k)) {
            if (i == (this.getSize() - k)) return current.getValue();

            i++;
            current = current.getNext();
        }

        return 0;
    }


/****************
 * MergeLists
 *
 * This method takes two linked lists and merges them together.
 * */
    public static LinkedList mergeList(LinkedList list1, LinkedList list2) {
        try {
            Node l1Current = list1.getHead();
            Node l2Current = list2.getHead();
            Node temp;

            while (l1Current != null && l2Current != null) {
                temp = l1Current.getNext();
                l1Current.setNext(l2Current);
                l1Current = temp;
                temp = l2Current.getNext();
                l2Current.setNext(l1Current);
                l2Current = temp;
            }

            return list1;
        } catch(Exception e) {
            System.err.println("An error has occurred: " + e);
            System.err.println("Press any key to exit...");
            System.console().readLine();
            System.exit(1);
        }

        return null;
    }
}
