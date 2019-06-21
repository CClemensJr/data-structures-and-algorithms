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


}
