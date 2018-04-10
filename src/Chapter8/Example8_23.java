package Chapter8;

import java.time.ZonedDateTime;
import java.util.Calendar;

public class Example8_23 {
    public ZonedDateTime convertFromCalendar(Calendar cal) {
        return ZonedDateTime.ofInstant(cal.toInstant(), cal.getTimeZone().toZoneId());
    }
}
