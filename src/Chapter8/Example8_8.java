package Chapter8;

import org.junit.Test;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

/**
 * Project: ModenJavaRecipes
 * FileName: Example8_8
 * Date: 2018-03-22
 * Time: 오후 1:47
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example8_8 {
    @Test
    public void with() throws Exception {
        LocalDateTime start = LocalDateTime.of(2017, Month.FEBRUARY, 2, 11, 30);
        LocalDateTime end = start.withMinute(45);
        assertEquals("2017-02-02T11:45:00",
                end.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        end = start.withHour(16);
        assertEquals("2017-02-02T16:30:00",
                end.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        end = start.withDayOfMonth(28);
        assertEquals("2017-02-28T11:30:00",
                end.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        end = start.withDayOfYear(300);
        assertEquals("2017-10-27T11:30:00",
                end.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        end = start.withYear(2020);
        assertEquals("2020-02-02T11:30:00",
                end.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }

    @Test(expected = DateTimeException.class)
    public void withInvalidDate() throws Exception {
        LocalDateTime start = LocalDateTime.of(2017, Month.FEBRUARY, 2, 11, 30);
        start.withDayOfMonth(29);
    }
}
