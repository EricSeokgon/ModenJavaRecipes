package Chapter8;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * Project: ModenJavaRecipes
 * FileName: Example8_14
 * Date: 2018-03-30
 * Time: 오후 1:07
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example8_14 {
    @Test
    public void payDayWithMethodRef() throws Exception {
        IntStream.rangeClosed(1, 14)
                .mapToObj(day -> LocalDate.of(2017, Month.JULY, day))
                .forEach(date ->
                        assertEquals(14,
                                date.with(Adjusters::adjustInto).getDayOfMonth()));
        IntStream.rangeClosed(15, 31)
                .mapToObj(day -> LocalDate.of(2017, Month.JULY, day))
                .forEach(date ->
                        assertEquals(31,
                                date.with(Adjusters::adjustInto).getDayOfMonth()));
    }
}
