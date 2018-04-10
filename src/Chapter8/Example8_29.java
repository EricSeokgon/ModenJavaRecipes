package Chapter8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example8_29{
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String text = now.format(DateTimeFormatter.ISO_DATE_TIME);
        LocalDateTime dateTime = LocalDateTime.parse(text);
    }

}
