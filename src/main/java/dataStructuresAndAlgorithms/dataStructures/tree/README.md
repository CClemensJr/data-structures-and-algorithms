# Trees
> One of the most common data structures for sifting through data.

## Challenge
> Implement a Tree Data Structure.

## Challenge 2.0
> Write a breadth first traversal method which takes a Binary Tree as its unique input. 
	Without utilizing any of the built-in methods available to your language, traverse 
	the input tree using a Breadth-first approach; print every visited node's value.
	
### Example
|Input|Output|
|-----|-------|
| [3, 5, 15] | 3 5 15|
| [3, 5, 19]  | 3 5 19 |

## Challenge 3.0
> Write a function called find-maximum-value which takes binary tree as its only input.
  	Without utilizing any of the built-in methods available to your language, return the 
  	maximum value stored in the tree. You can assume that the values stored in the Binary 
  	Tree will be numeric.

### Example
|Input|Output|
|-----|-------|
| [(3), (5), (15)] | 15 |
| [(3), (55), (19)]  | 55 |

## Approach and Efficiency
### Binary Tree
> A binary tree is unordered so to find a value the whole tree may need to be searched.
	Recursion is used to go traverse through the tree. This results in:
```
    Time: O(n)
    Space: O(H), where H is the height of the tree
```
	

### Binary Search Tree
> A binary search tree is always ordered and can use a while loop to traverse through
	the tree. This results in 
	
```
	Time: O(log n)
	Space: O(1)
```

### Breadth First Traversal
> For this problem I decided to use a queue to traverse through the tree level by level.
	At each level the nodes were enqueued and when they are dequeued the value is sent to 
	the console.
```
	Time: O(n)
	Space: O(W), where W is the width of the tree.
```

### Find Max Value
> For this problem I decided to use breadth first traversal to traver the tree level by 
  	level. The max value is initially set to 0 and is updated when a traversed node is
  	greater the current max value. The max value is returned after the entire tree has
  	been traversed.

```
	Time: O(n)
	Space: O(W), where W is the width of the tree.
```


## API
### Binary Tree
>	Within the Binary Tree implementation I created 3 methods: PreOrder, InOrder, and PostOrder. 

```
    PreOrder takes a value then returns an array of the nodes, always checking the root node first.
    
    InOrder takes a value then returns an array of the nodes, always checking the root node second.
    
    PostOrder takes a value then returns an array of the nodes, always checking the root node third.
```
    

### Binary Search Tree
> Within the Binary Search Tree implementation I created 2 methods: Add and Contains;

```
    Add takes a value and attaches a new node with that value to the tree.

    Contains takes a value and traverses through the tree, returning true or false based on if it is in the tree.
```


### Solutions
#### Breadth First Traversal
![alt text](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/breadthFirstTraversal1.JPG "Breadth First Traversal Part 1")
![alt text](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/breadthFirstTraversal2.JPG "Breadth First Traversal Part 2")

#### Find Max Binary Tree
![alt text](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/findMaxValBinaryTree1.jpeg "Find Max Value in a Binary Tree Part 1")
![alt text](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/findMaxValBinaryTree2.jpeg "Find Max Value In a Binary Tree Part 2")
