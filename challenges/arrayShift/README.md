#Insert and Shift an Array

##Challenge
> Write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.

##Example
|Input|	Output|
|-----|-------|
| [2,4,6,8], 5 | [2,4,5,6,8] |
| [4,8,15,23,42], 16 | [4,8,15,16,23,42] |

##Approach and Efficiency
> My approach to solving this problem involved creating a new array big enough to hold the original array and the value to be added to it.
I then used a for loop to iterate over the new array, placing the values of the old array into the new array. 
When the middle of the array was reached, the value to be added was inserted into the new array.
Big O: O(N)

##Solution
![alt text](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/shiftArray.jpeg "Shift Array Whiteboard")