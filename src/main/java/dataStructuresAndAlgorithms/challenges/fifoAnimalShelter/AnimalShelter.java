package dataStructuresAndAlgorithms.challenges.fifoAnimalShelter;


import dataStructuresAndAlgorithms.dataStructures.stacksAndQueues.Queue;

import java.util.InputMismatchException;

public class AnimalShelter {
/********
 * Instance variables
 * */
    Queue shelter;


/********
 * Constructors
 * */
    public AnimalShelter() { this.shelter = new Queue(); }


/********
 * Getters / Setters
 * */
    public Queue getShelter() { return this.shelter; }


/********
 * Instance Methods
 * */

    public void enqueue(Animal animal) {
        try {
            if (animal.getTypeOfAnimal() == "dog" || animal.getTypeOfAnimal() == "cat" ) {
                shelter.enqueue(animal.getTypeOfAnimal());
            } else {
                throw new InputMismatchException("Please enter cat or dog");
            }

        } catch(Exception e) {

            System.err.println("An error has occurred: " + e);
        }
    }


    public Animal dequeue(Animal preference) {
        return null;
    }
}
