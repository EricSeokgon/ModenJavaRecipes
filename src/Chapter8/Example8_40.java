package Chapter8;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Example8_40 {
    public static void main(String[] args) {
        LocalDate electionDay = LocalDate.of(2020, Month.NOVEMBER, 3);
        LocalDate today = LocalDate.now();
        System.out.printf("%d day(s) to go...%n",
                ChronoUnit.DAYS.between(today, electionDay));
    }
}
