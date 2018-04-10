package Chapter8;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example8_25 {
    public LocalDateTime convertFromUtilDateToLDUsingString(Date date) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return LocalDateTime.parse(df.format(date),
                DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
}
