package Chapter8;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

/**
 * Project: ModenJavaRecipes
 * FileName: Examaple8_6
 * Date: 2018-03-21
 * Time: 오전 9:25
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Examaple8_6 {
    @Test
    public void localDatePlus() throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start = LocalDate.of(2017, Month.FEBRUARY, 2);
        LocalDate end = start.plusDays(3);
        assertEquals("2017-02-05", end.format(formatter));
        end = start.plusWeeks(5);
        assertEquals("2017-03-09", end.format(formatter));
        end = start.plusMonths(7);
        assertEquals("2017-09-02", end.format(formatter));
        end = start.plusYears(2);
        assertEquals("2019-02-02", end.format(formatter));
    }

    @Test
    public void localTimePlus() throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
        LocalTime start = LocalTime.of(11, 30, 0, 0);
        LocalTime end = start.plusNanos(1_000_000);
        assertEquals("11:30:00.001", end.format(formatter));
        end = start.plusSeconds(20);
        assertEquals("11:30:20", end.format(formatter));
        end = start.plusMinutes(45);
        assertEquals("12:15:00", end.format(formatter));
        end = start.plusHours(5);
        assertEquals("16:30:00", end.format(formatter));
    }
}
