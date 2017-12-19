package Chapter5;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_1Test
 * Date: 2017-12-19
 * Time: 오전 9:24
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
class Example5_1Test {

    @Test
    public void testNonNulls() throws Exception {
        List<String> strings =
                Arrays.asList("this", "is", "a", "list", "of", "strings");
        List<String> nonNullStrings = strings.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        assertTrue(Objects.deepEquals(strings, nonNullStrings));
    }


}