package example_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example1_28
 * Date: 2017-09-19
 * Time: 오전 11:44
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example1_28 {
    public static void main(String[] args) {
        List<String> bonds = Arrays.asList("Connery", "Lazenby", "Moore", "Dalton", "Brosnan", "Craig");

        //Natural order
        List<String> sorted = bonds.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        //Reverse lexicographical
        sorted = bonds.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        //Sort by lowercase name
        sorted = bonds.stream()
                .sorted(Comparator.comparing(String::toLowerCase))
                .collect(Collectors.toList());

        //Sort by name length
        sorted = bonds.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        //Sort name length, then equal lengths lexicographically
        sorted = bonds.stream()
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());
    }
}
