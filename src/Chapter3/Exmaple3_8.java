package Chapter3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Exmaple3_8
 * Date: 2017-09-26
 * Time: 오전 11:10
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Exmaple3_8 {
    public static void main(String[] args) {
        List<String> strings = Stream.of("this", "is", "a", "list", "of", "strings")
                .collect(Collectors.toList());
    }
}
