package Chapter6;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example6_4
 * Date: 2018-02-06
 * Time: 오전 9:13
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example6_4 {
    public static void main(String[] args) {
        Optional<String> firstEven =
                Stream.of("five", "even", "length", "string", "values")
                        .filter(s -> s.length() % 2 == 0)
                        .findFirst();
    }
}
