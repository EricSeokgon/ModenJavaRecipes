package Chapter8;

import java.time.LocalDate;
import java.time.temporal.Temporal;

/**
 * Project: ModenJavaRecipes
 * FileName: Adjusters
 * Date: 2018-03-29
 * Time: 오전 11:02
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Adjusters {

    public static Temporal adjustInto(Temporal input) {
        LocalDate date = LocalDate.from(input);
        // ... implementation as before ...
        return input.with(date);
    }

}
