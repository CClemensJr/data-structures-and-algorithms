# FizzBuzz Tree

## Challenge
```
	Write a function called FizzBuzzTree which takes a tree as an argument.

	Without utilizing any of the built-in methods available to your language, determine weather 
	or not the value of each node is divisible by 3, 5 or both, and change the value of each of 
	the nodes:
		If the value is divisible by 3, replace the value with “Fizz”
		If the value is divisible by 5, replace the value with “Buzz”
		If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
	
	Return the tree with its new values.
```

## Example
|Input|Output|
|-----|-------|
| [3, 5, 15] | ["Fizz", "Buzz", "FizzBuzz"] |
| [3, 5, 19]  | ["Fizz", "Buzz", 19] |


## Approach and Efficiency
```
	For this problem I decided to use preorder traversal to go through the tree. This allowed for the tree
	to be returned in the same order as the incoming tree.

	Big O: Time: O(n), Space: O(H), where H is the height of the tree.
```

## Solution
![alt text](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/fizzBuzzTree.JPG "FizzBuzz Tree")
