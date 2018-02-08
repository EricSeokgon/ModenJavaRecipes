package Chapter6;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example6_6
 * Date: 2018-02-08
 * Time: 오전 9:07
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example6_6 {
    public static void main(String[] args) {
        Optional<String> firstEven =
                Stream.of("five", "even", "length", "string", "values")
                        .filter(s -> s.length() % 2 == 0)
                        .findFirst();
        System.out.println(
                firstEven.isPresent() ? firstEven.get() : "No even length strings");
    }
}
