package dataStructuresAndAlgorithms;

import static dataStructuresAndAlgorithms.challenges.multiBracketValidation.MultiBracketValidation.multiBracketValidation;
import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test
    public void canReturnFalseIfMissingABracket() {
        String test = "{}[](";

        assertFalse(multiBracketValidation(test));
    }

    @Test
    public void canReturnTrueIfOnePairOfValidBracketsReceived() {
        String test = "{}";

        assertEquals(true, multiBracketValidation(test));
    }

    @Test
    public void canReturnTrueIfMultiplePairsOfValidBracketsReceived() {
        String test = "{}()[]";

        assertEquals(true, multiBracketValidation(test));
    }

    @Test
    public void canReturnTrueIfValidNestedBracketsReceived() {
        String test = "{([])}";

        assertEquals(true, multiBracketValidation(test));
    }

    @Test
    public void canReturnFalseIfOnePairOfInValidBracketsReceived() {
        String test = "{}";

        assertEquals(true, multiBracketValidation(test));
    }

    @Test
    public void canReturnFalseIfMultiplePairsOfInValidBracketsReceived() {
        String test = "{}()[]";

        assertEquals(true, multiBracketValidation(test));
    }
}
