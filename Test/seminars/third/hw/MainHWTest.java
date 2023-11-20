package seminars.third.hw;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MainHWTest {
    @ParameterizedTest
    @ValueSource(ints={6, 4, 2})
    public void testEvenNumber(int i) {
        assertTrue(MainHW.evenOddNumber(i));
    }
    @ParameterizedTest
    @ValueSource(ints={1, 19, 23})
    public void testOddNumber(int i) {
        assertFalse(MainHW.evenOddNumber(i));
    }

    @ParameterizedTest
    @ValueSource(ints={25, 50, 100})
    public void testRangeTrue(int i) {
        assertTrue(MainHW.numberInInterval(i));
    }

    @ParameterizedTest
    @ValueSource(ints={-100, 24, 101})
    public void testRangeFalse(int i) {
        assertFalse(MainHW.numberInInterval(i));
    }
}