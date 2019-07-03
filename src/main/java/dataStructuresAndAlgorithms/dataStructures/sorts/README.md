# Sorts
> got to sort that data!

## Challenge
### Insertion Sort
> Complete a working, tested implementation of Insertion Sort, based on the pseudo code provided
```
    InsertionSort(int[] arr)
      
        FOR i = 1 to arr.length
        
          int j <-- i - 1
          int temp <-- arr[i]
          
          WHILE j >= 0 AND temp < arr[j]
            arr[j + 1] <-- arr[j]
            j <-- j - 1
            
          arr[j + 1] <-- temp
```

### Merge Sort
> Complete a working, tested implementation of Merge Sort, based on the pseudo code provided.
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

### Quick Sort
> Complete a working, tested implementation of Quick Sort, based on the pseudo code provided

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

## Approach and Efficiency
### Insertion Sort
> Insertion Sort uses two while loops to iterate over in the array and inspect each element. This results in an average 
time complexity of O(n^2).

### Merge Sort
> The merge sort algorithm uses both recursion and looping to sort the array. This results in an average time complexity 
of O(n log n).

### Quick Sort
> The quick sort algorithm is a divide and conquer algorithm like merge sort. Similarly, it has an average time complexity
of O(n log n). 
