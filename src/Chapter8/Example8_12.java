package Chapter8;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * Project: ModenJavaRecipes
 * FileName: Example8_12
 * Date: 2018-03-28
 * Time: 오전 9:43
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example8_12 {
    public void payDay() throws Exception {
        TemporalAdjuster adjuster = new PaydayAdjuster();
        IntStream.rangeClosed(1, 14)
                .mapToObj(day -> LocalDate.of(2017, Month.JULY, day))
                .forEach(date ->
                        assertEquals(14, date.with(adjuster).getDayOfMonth()));
        IntStream.rangeClosed(15, 31)
                .mapToObj(day -> LocalDate.of(2017, Month.JULY, day))
                .forEach(date ->
                        assertEquals(31, date.with(adjuster).getDayOfMonth()));
    }
}
