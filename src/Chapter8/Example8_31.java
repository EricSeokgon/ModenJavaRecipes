package Chapter8;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Example8_31 {
    public static void main(String[] args) {
        ZonedDateTime moonLanding = ZonedDateTime.of(
                LocalDate.of(1969, Month.JULY, 20),
                LocalTime.of(20, 18),
                ZoneId.of("UTC")
        );
        System.out.println(moonLanding.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("uuuu/MMMM/dd hh:mm:ss a zzz GG");
        System.out.println(moonLanding.format(formatter));
        formatter = DateTimeFormatter.ofPattern("uuuu/MMMM/dd hh:mm:ss a VV xxxxx");
        System.out.println(moonLanding.format(formatter));
    }
}
