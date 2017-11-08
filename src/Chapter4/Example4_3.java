package Chapter4;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;
import static java.util.stream.Collectors.toList;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_3
 * Date: 2017-11-08
 * Time: 오전 9:15
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_3 {
    private List<String> sampleStrings = Arrays.asList("this", "is", "a", "list", "of", "strings");

    public List<String> lengthSortThenAlphaSort() {
        return sampleStrings.stream()
                .sorted(comparing(String::length)
                        .thenComparing(naturalOrder()))
                .collect(toList());
    }
}
