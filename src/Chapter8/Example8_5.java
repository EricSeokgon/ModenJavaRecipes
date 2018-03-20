package Chapter8;

import java.time.Month;

/**
 * Project: ModenJavaRecipes
 * FileName: Example8_5
 * Date: 2018-03-20
 * Time: 오후 1:25
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example8_5 {
    public static void main(String[] args) {
        System.out.println("Days in Feb in a leap year: " +
                Month.FEBRUARY.length(true));
        System.out.println("Day of year for first day of Aug (leap year): " +
                Month.AUGUST.firstDayOfYear(true));
        System.out.println("Month.of(1): " + Month.of(1));
        System.out.println("Adding two months: " + Month.JANUARY.plus(2));
        System.out.println("Subtracting a month: " + Month.MARCH.minus(1));
    }
}
