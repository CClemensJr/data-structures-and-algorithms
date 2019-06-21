package dataStructuresAndAlgorithms;

import dataStructuresAndAlgorithms.challenges.fifoAnimalShelter.Animal;
import dataStructuresAndAlgorithms.challenges.fifoAnimalShelter.AnimalShelter;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test
    public void canCreateAnEmptyShelter() {
        AnimalShelter test = new AnimalShelter();

        int expected = 0;
        int actual = test.getShelter().getSize();

        assertEquals(expected, actual);
    }

    @Test
    public void canEnqueueCatOrDog() {
        AnimalShelter testShelter = new AnimalShelter();
        Animal testDog = new Animal("dog");

        testShelter.enqueue(testDog);

        String expected = "dog";
        String actual = (String) testShelter.getShelter().peek();

        assertEquals(expected, actual);
    }

    @Test
    public void canDequeueCatOrDog() {
        AnimalShelter testShelter = new AnimalShelter();
        Animal testCat = new Animal("cat");

        testShelter.enqueue(testCat);

        String expected = "cat";
        String actual = (String) testShelter.getShelter().dequeue();

        assertEquals(expected, actual);
    }
}
