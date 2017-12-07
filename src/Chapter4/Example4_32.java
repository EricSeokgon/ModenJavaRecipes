package Chapter4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_32
 * Date: 2017-12-07
 * Time: 오전 11:38
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_32 {
    @SafeVarargs
    public final <T> List<T> createImmutableList(T... elements) {
        return Arrays.stream(elements)
                .collect(collectingAndThen(toList(),
                        Collections::unmodifiableList));
    }
    @SafeVarargs
    public final <T> Set<T> createImmutableSet(T... elements) {
        return Arrays.stream(elements)
                .collect(collectingAndThen(toSet(),
                        Collections::unmodifiableSet));
    }
}
