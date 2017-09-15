package example_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example1_10
 * Date: 2017-09-15
 * Time: 오전 9:38
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example1_10 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
        List<String> sorted = strings.stream()
                .sorted((s1, s2) -> s1.compareTo(s2)) //Method reference and equivalent lambda
                .collect(Collectors.toList());

    }
}
