package dataStructuresAndAlgorithms;

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
}
