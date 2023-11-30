package seminars.sixth.hw;

/** Calculates the average for an array of integers. */
public class Average {
  /**
  * Calculates the average for an array of integers.
  *
  * @param numbers1 The array of integers.
  * @param numbers2 The array of integers.
  * @return The average value.
  */
  public String compareValues(int[] numbers1, int[] numbers2) {
    double average1 = getValue(numbers1);
    double average2 = getValue(numbers2);
    if (average1 > average2) {
      return "Первый список имеет большее среднее значение";
    } else if (average1 < average2) {
      return  "Второй список имеет большее среднее значение";
    } else {
      return "Средние значения равны";
    }
  }

  private double getValue(int [] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum / numbers.length;
  }
}