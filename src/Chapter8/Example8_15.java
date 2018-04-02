package Chapter8;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalQueries;

import static org.junit.Assert.assertEquals;

/**
 * Project: ModenJavaRecipes
 * FileName: Example8_15
 * Date: 2018-04-02
 * Time: 오전 9:03
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example8_15 {
    @Test
    public void queries() throws Exception {
        assertEquals(ChronoUnit.DAYS,
                LocalDate.now().query(TemporalQueries.precision()));
        assertEquals(ChronoUnit.NANOS,
                LocalTime.now().query(TemporalQueries.precision()));
        assertEquals(ZoneId.systemDefault(),
                ZonedDateTime.now().query(TemporalQueries.zone()));
        assertEquals(ZoneId.systemDefault(),
                ZonedDateTime.now().query(TemporalQueries.zoneId()));
    }
}
