package Chapter3;

import java.util.Arrays;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_14
 * Date: 2017-09-27
 * Time: 오전 9:15
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_14 {
    public static void main(String[] args) {
        String[] strings = "this is an array of strings".split(" ");
        long count = Arrays.stream(strings)
                .map(String::length)
                .count();
        System.out.println("There are " + count + " strings");
    }
}
