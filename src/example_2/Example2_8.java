package example_2;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example2_8
 * Date: 2017-09-20
 * Time: 오후 5:18
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example2_8 {
    public String getNamesStartingWith(String s, String... names) {
        return Arrays.stream(names)
                .filter(s1 -> s.startsWith(s))
                .collect(Collectors.joining(", "));
    }
}
