package data.structures.and.algorithms;

import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {
    @Test
    public void canCreateNode() {
        Node testNode = new Node("7");

        assertTrue(testNode.getValue() == "7");
    }

    @Test
    public void canGetNodeValue() {
        Node testNode = new Node("7");

        assertTrue(testNode.getValue() == "7");
    }

    @Test
    public void canSetNodeValue() {
        Node testNode = new Node("7");

        testNode.setValue("77");

        assertTrue(testNode.getValue() == "77");
    }
}
