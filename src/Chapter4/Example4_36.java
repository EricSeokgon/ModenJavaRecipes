package Chapter4;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_35
 * Date: 2017-12-12
 * Time: 오전 9:35
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_36 {
    public SortedSet<String> oddLengthStringSet(String... strings) {
        Collector<String, ?, SortedSet<String>> intoSet =
                Collector.of(TreeSet<String>::new,
                        SortedSet::add,
                        (left, right) -> {
                            left.addAll(right);
                            return left;
                        },
                        Collections::unmodifiableSortedSet);
        return Stream.of(strings)
                .filter(s -> s.length() % 2 != 0)
                .collect(intoSet);
    }
}
