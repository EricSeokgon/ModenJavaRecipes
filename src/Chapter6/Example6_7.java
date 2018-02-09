package Chapter6;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example6_7
 * Date: 2018-02-09
 * Time: 오전 9:01
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example6_7 {
    public static void main(String[] args) {
        Optional<String> firstOdd =
                Stream.of("five", "even", "length", "string", "values")
                        .filter(s -> s.length() % 2 != 0)
                        .findFirst();
        System.out.println(firstOdd.orElse("No odd length strings"));
    }
}
