package dataStructuresAndAlgorithms;

import org.junit.Test;

import static dataStructuresAndAlgorithms.challenges.repeatedWord.RepeatedWord.findTheRepeatedWord;
import static org.junit.Assert.*;

public class RepeatedWordTest {
    @Test
    public void canReturnFirstRepeatedWord() {
        String test = "What is love? Baby don't hurt me, don't hurt me, no more";
        String expected = "don't";
        String actual = findTheRepeatedWord(test);

        assertEquals(expected, actual);
    }


    @Test
    public void canReturnNullWhenNoRepeats() {
        String test = "What is love?";
        String actual = findTheRepeatedWord(test);

        assertNull(actual);
    }


    @Test
    public void canReturnNullWhenStringEmpty() {
        String test = " ";
        String actual = findTheRepeatedWord(test);

        assertNull(actual);
    }
}
