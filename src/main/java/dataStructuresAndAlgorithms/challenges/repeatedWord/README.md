# Find the First Repeated Word

## Challenge
```
	Write a method that accepts a lengthy string parameter and returns the first word 
	to occur more than once in that provided string.
```
## Example
|Input|Output|
|-----|-------|
| "Once upon a time, there was a brave princess who..." | a |
| "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."  | summer |

## Approach and Efficiency
```
	For this problem I decided to use a hash table. I iterated through the string and assigned 
	each word to an element in the hashtable. When a duplicate occurs, it is return.

	Big O: Search: Time: O(1), Space: O(n).
```

## Solution
![alt text](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/findMaxValBinaryTree1.jpeg "Find Max Value in a Binary Tree Part 1")
![alt text](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/findMaxValBinaryTree2.jpeg "Find Max Value In a Binary Tree Part 2")
