package example_2;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example2_7
 * Date: 2017-09-20
 * Time: 오후 5:14
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example2_7 {
    public String getNameOfLength(int length, String... names) {
        return Arrays.stream(names)
                .filter(s -> s.length() == length)
                .collect(Collectors.joining(", "));
    }
}
