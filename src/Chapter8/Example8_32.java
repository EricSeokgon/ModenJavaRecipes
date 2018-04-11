package Chapter8;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Example8_32 {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.of(2018, 3, 11, 2, 30, 0, 0,
                ZoneId.of("America/New_York"));
        System.out.println(
                zdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
    }
}
