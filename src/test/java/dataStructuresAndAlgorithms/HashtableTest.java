package dataStructuresAndAlgorithms;

import dataStructuresAndAlgorithms.dataStructures.hashtable.Hashtable;
import dataStructuresAndAlgorithms.dataStructures.hashtable.Node;
import org.junit.Test;
import static org.junit.Assert.*;

public class HashtableTest<T> {
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
        T actual = (T) testTable.get(testKey);

        assertEquals(expected, actual);
    }


    @Test
    public void canHandleCollision() {
        Hashtable testTable = new Hashtable(5);

        String testKey = "test key";
        String testValue = "test value";

        String keyTest = "key test";
        String valueTest = "value test";

        testTable.add(testKey, testValue);
        testTable.add(keyTest, valueTest);

        assertTrue(testTable.contains(testKey));
        assertTrue(testTable.contains(keyTest));
    }


    @Test
    public void canGetValueFromCollision() {
        Hashtable testTable = new Hashtable(5);

        String testKey = "test key";
        String testValue = "test value";

        String keyTest = "key test";
        String valueTest = "value test";

        testTable.add(testKey, testValue);
        testTable.add(keyTest, valueTest);

        String expected = valueTest;
        T actual = (T) testTable.get(keyTest);

        assertEquals(expected, actual);
    }
}
