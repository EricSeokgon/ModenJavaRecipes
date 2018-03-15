package Chapter8;

import java.time.*;

/**
 * Project: ModenJavaRecipes
 * FileName: Example8_1
 * Date: 2018-03-15
 * Time: 오전 9:50
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example8_1 {
    public static void main(String[] args) {
        System.out.println("Instant.now(): " + Instant.now());
        System.out.println("LocalDate.now(): " + LocalDate.now());
        System.out.println("LocalTime.now(): " + LocalTime.now());
        System.out.println("LocalDateTime.now(): " + LocalDateTime.now());
        System.out.println("ZonedDateTime.now(): " + ZonedDateTime.now());
    }
}
