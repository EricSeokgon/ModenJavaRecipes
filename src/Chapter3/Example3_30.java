package Chapter3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_30
 * Date: 2017-10-18
 * Time: 오전 9:16
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_30 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "string");

        List<String> sorted = strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(toList());

        System.out.println(sorted);
    }
}
