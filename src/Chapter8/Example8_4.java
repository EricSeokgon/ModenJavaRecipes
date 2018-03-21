package Chapter8;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Project: ModenJavaRecipes
 * FileName: Example8_4
 * Date: 2018-03-19
 * Time: 오전 9:45
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example8_4 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2017, Month.JULY, 4, 13, 20, 10);
        ZonedDateTime nyc = dateTime.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(nyc);
        ZonedDateTime london = nyc.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println(london);
    }
}
