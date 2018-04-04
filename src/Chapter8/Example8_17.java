package Chapter8;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.stream.IntStream;

import static junit.framework.TestCase.assertTrue;

public class Example8_17 {
    @Test
    public void pirateDay() throws Exception {
        IntStream.range(10, 19)
                .mapToObj(n -> LocalDate.of(2017, Month.SEPTEMBER, n))
                .forEach(date ->
                        assertTrue(date.query(this::daysUntilPirateDay) <= 9));
        IntStream.rangeClosed(20, 30)
                .mapToObj(n -> LocalDate.of(2017, Month.SEPTEMBER, n))
                .forEach(date -> {
                    Long days = date.query(this::daysUntilPirateDay);
                    assertTrue(days >= 354 && days < 365);
                });
    }

    private long daysUntilPirateDay(TemporalAccessor temporal) {
        int day = temporal.get(ChronoField.DAY_OF_MONTH);
        int month = temporal.get(ChronoField.MONTH_OF_YEAR);
        int year = temporal.get(ChronoField.YEAR);
        LocalDate date = LocalDate.of(year, month, day);
        LocalDate tlapd = LocalDate.of(year, Month.SEPTEMBER, 19);
        if (date.isAfter(tlapd)) {
            tlapd = tlapd.plusYears(1);
        }
        return ChronoUnit.DAYS.between(date, tlapd);
    }

}
