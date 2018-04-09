package Chapter8;

import java.time.LocalDate;

public class Example8_22 {
    public LocalDate convertUtilDateToLocalDate(java.util.Date date) {
        return new java.sql.Date(date.getTime()).toLocalDate();
    }
}
