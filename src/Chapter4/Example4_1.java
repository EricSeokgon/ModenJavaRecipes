package Chapter4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_1
 * Date: 2017-11-06
 * Time: 오전 9:21
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_1 {
    private List<String> sampleStrings = Arrays.asList("this", "is", "a", "list", "of", "strings");

    public List<String> defaultSort() {
        Collections.sort(sampleStrings);
        return sampleStrings;

    }

    public List<String> defaultSortUsingStreams() {
        return sampleStrings.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
