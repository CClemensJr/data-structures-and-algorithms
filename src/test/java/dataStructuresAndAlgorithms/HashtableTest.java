package dataStructuresAndAlgorithms;

import dataStructuresAndAlgorithms.dataStructures.hashtable.Hashtable;
import org.junit.Test;
import static org.junit.Assert.*;

public class HashtableTest {
    @Test
    public void canHashAKey() {
        Hashtable testTable = new Hashtable(5);
        String testKey = "Test";
        int testIndex = testTable.hash(testKey);

        assertTrue(testIndex >= 0 && testIndex <= 4);
    }

    @Test
    public void canVerifyIfKeyDoesntExist() {
        Hashtable testTable = new Hashtable(5);
        String testKey = "Test";

        assertFalse(testTable.contains(testKey));
    }
}
