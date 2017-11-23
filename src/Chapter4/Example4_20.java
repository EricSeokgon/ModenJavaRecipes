package Chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_20
 * Date: 2017-11-23
 * Time: 오전 10:28
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_20 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("this", "is", "a", "long", "list", "of",
                "strings", "to", "use", "as", "a", "demo");
        Map<Boolean, List<String>> lengthMap = strings.stream()
                .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0));
        lengthMap.forEach((key, value) -> System.out.printf("%5s: %s%n", key, value));
    }
}
