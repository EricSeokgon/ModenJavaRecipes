package Chapter8;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

import static org.junit.Assert.assertEquals;

/**
 * Project: ModenJavaRecipes
 * FileName: Example8_10
 * Date: 2018-03-26
 * Time: 오전 10:50
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example8_10 {
    @Test
    public void adjusters() throws Exception {
        LocalDateTime start = LocalDateTime.of(2017, Month.FEBRUARY, 2, 11, 30);
        LocalDateTime end = start.with(TemporalAdjusters.firstDayOfNextMonth());
        assertEquals("2017-03-01T11:30", end.toString());
        end = start.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        assertEquals("2017-02-09T11:30", end.toString());
        end = start.with(TemporalAdjusters.previousOrSame(DayOfWeek.THURSDAY));
        assertEquals("2017-02-02T11:30", end.toString());

    }
}
