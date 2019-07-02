# Lecture Notes: Merge Sort
> "In computer science, merge sort (also commonly spelled mergesort) is an efficient, general-purpose, comparison-based sorting algorithm." - https://en.wikipedia.org/wiki/Merge_sort

## Learning Objectives
* How it works
* Efficiency

## Lecture Flow
* Merge sort from least to greatest using a divide and conquer approach.
    * Merge sort uses a recursive method to sort the array.
    * Each recursive call breaks the array into smaller arrays.
    * A helper function is used to merge the elements into new arrays 
* Merge sort is efficient
    * The merge sort algorithm uses both recursion and looping to sort the array. This results in an average time complexity 
      of O(n log n).

## Diagram
```
    input: 2|8|5|3|9|4|1|7
    
    // Split into individual elements
        2|8|5|3 9|4|1|7
        
        2|8 5|3 9|4 1|7
        
        2 8 5 3 9 4 1 7
        
    // Compare each element then merge them into temporary, sorted arrays
        2|8 3|5 4|9 1|7
        
        2|3|5|8 1|4|7|9
        
        1|2|3|4|5|7|8|9
    
    output: 1|2|3|4|5|7|8|9
```

## Algorithm
```
    1. Continually split array in half until left with individual items
    2. Examine each item
    3. Compare them
    4. Merge them into temporary arrays in the correct order.
```

## Pseudocode
```
    ALGORITHM Mergesort(arr)
        DECLARE n <-- arr.length
               
        if arr.length > 1
          DECLARE mid <-- n/2
          DECLARE b <-- arr[0...mid]
          DECLARE c <-- arr[mid...n]
          // break down the left side
          Mergesort(b)
          // break down the right side
          Mergesort(c)
          // merge the left and the right side together
          Merge(b, c, arr)
    
    ALGORITHM Merge(b, c, a)
        DECLARE i <-- 0
        DECLARE j <-- 0
        DECLARE k <-- 0
    
        while i < b && j < c
            if b[i] <= c[j]
                a[k] <-- b[i]
                i <-- i + 1
            else
                a[k] = c[j]
                j <-- j + 1
                
            k <-- k + 1
    
        if i = b.length
           add remaining items in array c to array a
        else
           add remaining items in array b to array a
           
        return a
```

## Readings and References

### Watch
* [Youtube](https://www.youtube.com/watch?v=TzeBrDU-JaY)

### Read
* [Geeks for Geeks](https://www.geeksforgeeks.org/merge-sort/)
* [Wikipedia](https://en.wikipedia.org/wiki/Merge_sort)
