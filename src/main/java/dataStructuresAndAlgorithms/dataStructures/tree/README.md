# Trees
> One of the most common data structures for sifting through data.

## Challenge
> Implement a Tree Data Structure.

## Approach and Efficiency
### Binary Tree
> A binary tree is unordered so to find a value the whole tree may need to be searched.
	Recursion is used to go traverse through the tree. This results in:
```
    Time: O(N)
    Space: O(H), where H is the height of the tree
```
	

### Binary Search Tree
> A binary search tree is always ordered and can use a while loop to traverse through
	the tree. This results in 
	
```
	Time: O(log n)
	Space: O(1)
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

