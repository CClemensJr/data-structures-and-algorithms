package dataStructuresAndAlgorithms.challenges.queueWithStacks;

import dataStructuresAndAlgorithms.dataStructures.stacksAndQueues.Node;
import dataStructuresAndAlgorithms.dataStructures.stacksAndQueues.Stack;

public class PseudoQueue {
/***********
 * Instance Variables
 * */
    protected Stack enqueStack;
    protected Stack dequeStack;
    protected Node front;
    //protected int size;


/***********
 * Constructor
 * */
    public PseudoQueue() {
        this.enqueStack = new Stack();
        this.dequeStack = new Stack();
    }


/***********
 * Getters/Setters
 * */
    public Node getFront() { return this.front; }
    public int getSize() { return this.enqueStack.getSize() + this.dequeStack.getSize(); }


/***********
 * Instance Methods
 * */
    public void enqueue(Object value) {
        this.enqueStack.push(value);

        if (this.front == null) this.front = this.enqueStack.getTop();
    }

    public Object dequeue() {
        return null;
    }
}
