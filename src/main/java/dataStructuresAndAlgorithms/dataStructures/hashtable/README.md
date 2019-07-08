# Hashtables
> one of the most common data structures for sifting through data.

## Challenge
```
	Implement a Hashtable.
```

## Approach and Efficiency
```
	For this datastructure I decided to use an array of nodes as my hashtable. 
	When collision occurs, a the data is added by placing the node in a linked list at that element.

	Time: O(1) if no list at the element, O(n) if there is
	Space: O(n)
```

## API
### add
> takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.

### get 
> takes in the key and returns the value from the table.

### contains
> takes in the key and returns a boolean, indicating if the key exists in the table already.

### hash
> takes in an arbitrary key and returns an index in the collection.
