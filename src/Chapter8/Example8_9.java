package Chapter8;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import static org.junit.Assert.assertEquals;

/**
 * Project: ModenJavaRecipes
 * FileName: Example8_9
 * Date: 2018-03-23
 * Time: 오전 9:20
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example8_9 {
    @Test
    public void temporalField() throws Exception {
        LocalDateTime start = LocalDateTime.of(2017, Month.JANUARY, 31, 11, 30);
        LocalDateTime end = start.with(ChronoField.MONTH_OF_YEAR, 2);
        assertEquals("2017-02-28T11:30:00",
                end.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
