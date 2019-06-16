# Multi-Bracket Validation

## Challenge
```
	On your main file, create a method that takes a string as its only argument, and should return a boolean representing
	whether or not the brackets in the string are balanced. 

	There are 3 types of brackets:
		Round Brackets: ()
		Square Brackets: []
		Curly Brackets: {}
```

## Example
|Input|Output|
|-----|-------|
| {} | TRUE |
| [] | TRUE |
| {) | FALSE |
| {I ate lobster][} | FALSE |
| {}now I (have) [l]o{bst]er (hands)!!! | FALSE |


## Approach and Efficiency
```
	For this problem I decided to use a queue to determine if the braces matched. I split the string into a character array
	then fed each character into the queue using the Enqueue method. The Dequeue method was used to pop characters from the 
	queue.

	Big O: Time: O(n), Space: O(1)
```

## Solution
![alt text](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/multiBracketValidation.JPG "MultiBracketValidation")
