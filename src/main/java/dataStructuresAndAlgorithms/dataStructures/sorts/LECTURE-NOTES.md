# Lecture Notes: Insertion Sort
> "Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands." - www.geeksforgeeks.org/insertion-sort/

## Learning Objectives
* How it works
* Efficiency
* How it differs

## Lecture Flow
* Insertion sort sorts from least to greatest.
    * Insertion sort compares the current value with the one next to it.
* Insertion sort uses loops
    * Uses two loops to go through entire array.
* Insertion sort is inefficient
    * Two loops means there is a time complexity of O(n^2)

## Diagram
```
    input: 12, 11, 13, 5, 6
    
    output: 5, 6, 11, 12, 13
```

## Algorithm
```
    1. Create method that takes an array
    2. Loop through the array
    3. Set a j variable equal to i - 1.
    4. Set a temp variable equal to the array at position i.
    5. Loop through the array again while j is greater than 0 and temp is less than array at position j
    6. Set j = to j - 1
    7. Set array at position j + 1 equal to temp
    8. Return array.
```

## Pseudocode
![Insertion Sort PsuedoCode](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/insertionSortPseudo.png "Insertion Sort Pseudo")

## Readings and References

### Watch
* [Youtube](https://youtu.be/OGzPmgsI-pQ)

### Read
* [Geeks for Geeks](https://www.geeksforgeeks.org/insertion-sort/)
* [Wikipedia](https://en.wikipedia.org/wiki/Insertion_sort)
