# Array Binary Search

## Challenge
> Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

## Example
|Input|	Output|
|-----|-------|
| [2,4,6,7,8], 7 | 3 |
| [4,8,15,23,42], 8 | 1 |

## Approach and Efficiency
### Approach
> I created variables to store the start, mid, and end points of the array. I then looped through the array comparing the mid point to the value. If the value was greater than mid, the start point was shifted to mid + 1 and the mid point shifted to the index between start and end. If the value was less then end was moved to the mid point - 1 and mid was adjust accordingly. This process continues until the value is found or all search combinations have been reached.

### Efficiency
> O lg(n)

## Solution
![alt text](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/arrayBinarySearch.jpg "Array Binary Search Whiteboard")