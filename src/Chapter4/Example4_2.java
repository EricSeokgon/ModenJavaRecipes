package Chapter4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_2
 * Date: 2017-11-07
 * Time: 오전 9:07
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_2 {
    private List<String> sampleStrings = Arrays.asList("this", "is", "a", "list", "of", "strings");

    public List<String> lengthSortUsingSorted() {
        return sampleStrings.stream()
                .sorted((s1, s2) -> s1.length() - s2.length())
                .collect(toList());
    }

    public List<String> lengthSortUsingComparator() {
        return sampleStrings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(toList());
    }
}
