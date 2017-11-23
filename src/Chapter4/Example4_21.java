package Chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_21
 * Date: 2017-11-24
 * Time: 오전 8:36
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_21 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("this", "is", "a", "long", "list", "of",
                "strings", "to", "use", "as", "a", "demo");
        Map<Integer, List<String>> lengthMap = strings.stream()
                .collect(Collectors.groupingBy(String::length));
        lengthMap.forEach((k,v) -> System.out.printf("%d: %s%n", k, v));
    }
}
