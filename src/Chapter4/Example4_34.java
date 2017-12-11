package Chapter4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_34
 * Date: 2017-12-11
 * Time: 오전 9:04
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_34 {
    public List<String> evenLengthStrings(String... strings) {
        return Stream.of(strings)
                .filter(s -> s.length() % 2 == 0)
                .collect(Collectors.toList());
    }
}
