package seminars.sixth.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AverageTest {

    Average average = new Average();
    int[] numbers1 = new int[] {10, 20 ,30};
    int[] numbers2 = new int[] {1, 2, 3};
    @Test
    public void testFirstAverageIsLarger() {
        assertEquals("Первый список имеет большее среднее значение", average.compareValues(numbers1, numbers2));
    }
    @Test
    public void testSecondAverageIsLarger() {
        assertEquals("Второй список имеет большее среднее значение", average.compareValues(numbers2, numbers1));
    }
    @Test
    public void testAverageIsEqual() {
        assertEquals("Средние значения равны", average.compareValues(numbers1, numbers1));
    }
}