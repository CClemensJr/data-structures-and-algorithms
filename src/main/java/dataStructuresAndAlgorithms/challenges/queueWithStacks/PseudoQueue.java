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
    protected int size;


/***********
 * Constructor
 * */
    public PseudoQueue() {
        this.size = 0;
    }


/***********
 * Getters/Setters
 * */
    public Node getFront() { return this.front; }
    public int getSize() { return this.size; }


/***********
 * Instance Methods
 * */
    public void enqueue(Object value) {
        this.enqueStack.push(value);
    }

    public Object dequeue() {
        return null;
    }
}
