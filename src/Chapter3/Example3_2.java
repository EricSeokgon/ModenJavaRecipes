package Chapter3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_2
 * Date: 2017-09-25
 * Time: 오전 9:10
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_2 {
    public static void main(String[] args) {
        String names = Stream.of("Gomez", "Morticia", "Wednesday", "Pugsley")
                .collect(Collectors.joining(", "));
        System.out.println(names);
    }
}
