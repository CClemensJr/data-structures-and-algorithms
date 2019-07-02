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

## Approach and Efficiency
### Insertion Sort
> Insertion Sort uses two while loops to iterate over in the array and inspect each element. This results in an average 
time complexity of O(n^2).

### Merge Sort
> The merge sort algorithm uses both recursion and looping to sort the array. This results in an average time complexity 
of O(n log n).
