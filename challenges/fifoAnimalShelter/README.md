# First In, First Out Animal Shelter

## Challenge
```
	Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, 
	first-out approach.

	Implement the following methods:
		enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.
		dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.
```

## Example
### Enqueue
|Input|Output|
|-----|-------|
| ["Cat"], ["Dog"]-> ["Cat"]-> ["Dog"] | ["Cat"]-> ["Dog"]-> ["Cat"]-> ["Dog"] |

### Dequeue
|Input|Output|
|-----|-------|
| "Dog", ["Cat"]-> ["Dog"]-> ["Cat"] | ["Cat"]-> ["Cat"], "Dog" |
| "Dragon", ["Cat"]-> ["Dog"]-> ["Cat"] | ["Cat"]-> ["Dog"]-> ["Cat"], null |

## Approach and Efficiency
### Enqueue
```
	Enqueu simply takes an animal and places it in the rear of the queue. Since there is no iteration, it's speed is constant.

	Big O: Time: O(1), Space: O(1)
```

### Dequeue
```
	Dequeue takes in a preference so iteration is required to find the preferred animal. I chose to use a while loop to 
	pop nodes off of the top of the queue until the top is equal to the preferred animal. Each popped off node is enqueued.

	If the preference is neither cat or dog, then null is immediately returned. 

Big O: Time: O(n), Space: O(1)
```

## Solution
![alt text](https://github.com/CClemensJr/data-structures-and-algorithms/blob/master/assets/fifoAnimalShelter.JPG "Queue with Stacks")
