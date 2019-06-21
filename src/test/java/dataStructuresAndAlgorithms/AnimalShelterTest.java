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
        int actual = test.getSize();

        assertEquals(expected, actual);
    }

    @Test
    public void canEnqueueCatOrDog() {
        AnimalShelter testShelter = new AnimalShelter();
        Animal testDog = new Animal("dog");

        testShelter.enqueue(testDog);

        String expected = "dog";
        String actual = testShelter.getShelter().getFront().getValue();

        assertEquals(expected, actual);
    }
}
