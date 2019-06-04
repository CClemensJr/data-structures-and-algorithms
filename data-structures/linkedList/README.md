# Singly Linked List
> A Linked List is a sequence of Nodes that are connected/linked to each other. The most defining feature of a Linked List is that each Node references the next Node in the link.

## Challenge
> Implement a Singly Linked List Data Structure

## Approach and Efficiency
> For this data-structure I created a LinkedList class that created an empty linked list with a head of null. The object then has access to three methods: insert(), includes(), and print().

> insert(int v): This method always adds the new node to the front of the linked list so the time and space efficiency is O(1);

> includes(int v): This method uses a while loop to iterate over the list to verify if v exists in the list. This results in a time efficiency of O(n) and a space efficiency of O(1) since no additional space is being created.  

> print(): This method uses a while loop to iterate over the list, adding the value of each node to an array. This results in a time efficiency of O(n) and a space efficiency of O(n) since the array size increases with the size of the list.

## API
### Insert
> This method takes a value, creates a new Node, and sets that Node at the head of the linked list.

### Includes
> This method takes a value and returns a boolean depending whether that value exists.

### Print
> This method returns a list of all nodes in the linked list.

### Append
> This method takes a value and adds a new node to the end of the linked list.
![Linked List Append Whiteboard](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/llInsertionsAppend.JPG "Linked List Append Whiteboard")

### InsertBefore
> This method takes an old value and a new value and inserts a new node with the new value before the node with the old value.
![Linked List Insert Before Whiteboard](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/llInsertionsInsertBefore.JPG "Linked List Insert Before Whiteboard")

### InsertAfter
> This method takes an old value and a new value and appends a new node with the new value after the node with the old value.
![Linked List Insert After Whiteboard](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/llInsertionsInsertAfter.JPG "Linked List Insert After Whiteboard")