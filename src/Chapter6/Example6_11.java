package Chapter6;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example6_11
 * Date: 2018-02-13
 * Time: 오전 9:01
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example6_11 {
    public static void main(String[] args) {
        Optional<String> first =
                Stream.of("five", "even", "length", "string", "values")
                        .filter(s -> s.length() % 2 == 0)
                        .findFirst();
        first.ifPresent(val -> System.out.println("Found an even-length string"));
        first = Stream.of("five", "even", "length", "string", "values")
                .filter(s -> s.length() % 2 != 0)
                .findFirst();
        first.ifPresent(val -> System.out.println("Found an odd-length string"));
    }
}
