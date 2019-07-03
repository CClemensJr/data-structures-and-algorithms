# Lecture Notes: Quick Sort
> "Quicksort (sometimes called partition-exchange sort) is an efficient sorting algorithm, serving as a systematic method
 for placing the elements of a random access file or an array in order" - https://en.wikipedia.org/wiki/Quicksort

## Learning Objectives
* How it works
* Efficiency

## Lecture Flow
* Quick sort from least to greatest using a divide and conquer approach.
    * Quick sort uses recursion to break down the array.
    * Quick sort relies on a "pivot" to sort with numbers smaller than the pivot on the left and larger than the pivot on the right
    * This recursion continues until the base case of a sub array w/ 0 or 1 elements is achieved.
* Quick sort is efficient
    * The quick sort algorithm uses both recursion sort the array. This results in an average time complexity 
      of O(n log n).
    * Though the average time complexity is the same as merge sort, it can be many times faster depending on the pivot.

## Diagram
```
    input: [2|8|5|3|7]
    
     // pivot: 8
        [2|5|3|7] <8> []
     // pivot: 5
        [2|3] <5> [7|8]
     // pivot: 3
        [2] <3> [5|7|8]
     // pivot: 2
         [] <2> [3|5|7|8]   
        
    output: [2|3|5|7|8]
```

## Algorithm
```
    1. Check if the array has 0 or 1 elements. Return it if so as it is already sorted.
    2. Select a pivot.
    3. Partition the array by moving all elements less than the pivot into a left sub array and all elements larger than the 
       pivot into a right sub array.
    4. Call quick sort recursively on each sub array
    5. Repeat until the sub arrays are all sorted
    6. Merge the sorted sub arrays into a single, sorted array.
```

## Pseudocode
```
    ALGORITHM QuickSort(arr, left, right)
        if left < right
            // Partition the array by setting the position of the pivot value 
            DEFINE position <-- Partition(arr, left, right)
            // Sort the left
            QuickSort(arr, left, position - 1)
            // Sort the right
            QuickSort(arr, position + 1, right)
    
    ALGORITHM Partition(arr, left, right)
        // set a pivot value as a point of reference
        DEFINE pivot <-- arr[right]
        // create a variable to track the largest index of numbers lower than the defined pivot
        DEFINE low <-- left - 1
        for i <- left to right do
            if arr[i] <= pivot
                low++
                Swap(arr, i, low)
    
         // place the value of the pivot location in the middle.
         // all numbers smaller than the pivot are on the left, larger on the right. 
         Swap(arr, right, low + 1)
        // return the pivot index point
         return low + 1
    
    ALGORITHM Swap(arr, i, low)
        DEFINE temp;
        temp <-- arr[i]
        arr[i] <-- arr[low]
        arr[low] <-- temp
```

## Readings and References

### Watch
* [Youtube](https://www.youtube.com/watch?v=SLauY6PpjW4)

### Read
* [Geeks for Geeks](https://www.geeksforgeeks.org/quick-sort/)
* [Wikipedia](https://en.wikipedia.org/wiki/Quicksort)
