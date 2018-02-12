package Chapter6;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example6_10
 * Date: 2018-02-12
 * Time: 오전 9:05
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example6_10 {
    public static void main(String[] args) {
        Optional<String> first =
                Stream.of("five", "even", "length", "string", "values")
                        .filter(s -> s.length() % 2 == 0)
                        .findFirst();
        System.out.println(first.orElseThrow(NoSuchElementException::new));
    }
}
