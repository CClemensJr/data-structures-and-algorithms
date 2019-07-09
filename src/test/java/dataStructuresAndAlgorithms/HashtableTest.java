package dataStructuresAndAlgorithms;

import dataStructuresAndAlgorithms.dataStructures.hashtable.Hashtable;
import dataStructuresAndAlgorithms.dataStructures.hashtable.Node;
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


    @Test
    public void canVerifyIfKeyDoesExist() {
        Hashtable testTable = new Hashtable(5);
        String testKey = "test key";
        String testValue = "test value";

        testTable.add(testKey, testValue);

        assertTrue(testTable.contains(testKey));
    }


    @Test
    public void canAddToHashMap() {
        Hashtable testTable = new Hashtable(5);
        String testKey = "test key";
        String testValue = "test value";

        testTable.add(testKey, testValue);

        assertTrue(testTable.contains(testKey));
    }


    @Test
    public void canGetTheValue() {
        Hashtable testTable = new Hashtable(5);
        String testKey = "test key";
        String testValue = "test value";

        testTable.add(testKey, testValue);

        String expected = testValue;
        String actual = testTable.get(testKey);

        assertEquals(expected, actual);
    }
}
