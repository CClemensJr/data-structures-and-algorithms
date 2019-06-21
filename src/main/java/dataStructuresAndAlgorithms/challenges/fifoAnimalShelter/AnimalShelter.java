package dataStructuresAndAlgorithms.challenges.fifoAnimalShelter;


import dataStructuresAndAlgorithms.dataStructures.stacksAndQueues.Queue;

public class AnimalShelter {
/********
 * Instance variables
 * */
    Queue shelter;
    int size;


/********
 * Constructors
 * */
    public AnimalShelter() {
        this.shelter = new Queue();
        this.size = 0;
    }


/********
 * Getters / Setters
 * */
    public int getSize() { return this.size; }
    public Queue getShelter() { return this.shelter; }

/********
 * Instance Methods
 * */

    public void enqueue(Animal animal) {


    }


    public Animal dequeue(Animal preference) {
        return null;
    }
}
