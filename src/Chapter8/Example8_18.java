package Chapter8;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Example8_18 {
    public LocalDate convertFromUtilDateUsingInstant(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
