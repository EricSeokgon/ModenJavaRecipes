package Chapter8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Project: ModenJavaRecipes
 * FileName: Example8_11
 * Date: 2018-03-27
 * Time: 오전 10:17
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PaydayAdjuster implements TemporalAdjuster {
    public Temporal adjustInto(Temporal input) {
        LocalDate date = LocalDate.from(input);
        int day;
        if (date.getDayOfMonth() < 15) {
            day = 15;
        } else {
            day = date.with(TemporalAdjusters.lastDayOfMonth())
                    .getDayOfMonth();
        }
        date = date.withDayOfMonth(day);
        if (date.getDayOfWeek() == DayOfWeek.SATURDAY ||
                date.getDayOfWeek() == DayOfWeek.SUNDAY) {
            date = date.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        }
        return input.with(date);
    }
}
