# Queue with Stacks

## Challenge
```
	Create a brand new PseudoQueue class that will implement the standard queue interface, but will internally 
	only utilize 2 Stack objects with the following methods:
		enqueue(value) which inserts value into the PseudoQueue, using a first-in, first-out approach.
		dequeue() which extracts a value from the PseudoQueue, using a first-in, first-out approach.

	The Stack instances have only push, pop, and peek methods. Instantiate these Stack objects in your PseudoQueue constructor.
```

## Example
### Enqueue
|Input|Output|
|-----|-------|
| [5], [4]-> [8]-> [15] | [5]-> [4]-> [8]-> [15] |

### Dequeue
|Input|Output|
|-----|-------|
| [5]-> [4]-> [8]-> [15] | [5]-> [4]-> [8] |

## Approach and Efficiency
### Enqueue
```
	For this challenge I chose to use a while loop to traverse empty one stack into another if the stack.top was not null
	During each iteration:
	* The Top of the queue stack is popped off.
	* The returned value of the pop method is pushed in a temporary queue.
	
	When the top of the queue stack is equal to null, the new node is inserted into the stack and then a while loop is used
	to pop the values from the temp stack and push them back into the queue stack.

Big O: Time: O(n), Space: O(1)
```

## Solution
![alt text](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/queueWithStacks.JPG "Queue with Stacks")