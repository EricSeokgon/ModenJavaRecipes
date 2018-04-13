package Chapter8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Example8_41 {
    public static void main(String[] args) {
        LocalDate electionDay = LocalDate.of(2020, Month.NOVEMBER, 3);
        LocalDate today = LocalDate.now();
        Period until = today.until(electionDay);
        int years = until.getYears();
        int months = until.getMonths();
        int days = until.getDays();
        System.out.printf("%d year(s), %d month(s), and %d day(s)%n", years, months, days);
    }
}
